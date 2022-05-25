package org.oobootcamp.code_smell.$16_temporary_field.unecessary_field;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StorageManger {
    private List<ProductBatch> productBatches = new ArrayList<>();
    private List<ProductBatch> productBatchesToExpired;

    public List<ProductBatch> getProductBatches() {
        return productBatches;
    }

    public List<ProductBatch> getProductBatchesToExpired() {
        return productBatchesToExpired;
    }

    public void addProductBatch(ProductBatch productBatch) {
        this.productBatches.add(productBatch);
        productBatchesToExpired = productBatches.stream().filter(batch ->
        {
            LocalDateTime expirationDate = LocalDateTime.ofInstant(batch.getExpiredDate().toInstant(), ZoneId.systemDefault());
            return LocalDateTime.now().plusDays(30).isAfter(expirationDate);
        }).collect(Collectors.toList());
    }

    public void removeProductBatch(ProductBatch productBatch) {
        productBatches.removeIf(batch -> batch.getBatchId().equals(productBatch.getBatchId()));
    }

    public void sendExpiredAlert() {
        System.out.println("Expired alert:\n");
        productBatchesToExpired.forEach(productBatch ->
                System.out.println(productBatch.getName() + " " + productBatch.getBatchId()
                        + " will expired on " + productBatch.getExpiredDate().toString()));
    }
}
