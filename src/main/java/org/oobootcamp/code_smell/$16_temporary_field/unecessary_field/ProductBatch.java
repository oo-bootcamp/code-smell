package org.oobootcamp.code_smell.$16_temporary_field.unecessary_field;

import java.util.Date;

public class ProductBatch {
    private String name;
    private String batchId;
    private int batchCountTotal;
    private int batchCountLeft;
    private Date expiredDate;

    public String getName() {
        return name;
    }

    public String getBatchId() {
        return batchId;
    }

    public int getBatchCountTotal() {
        return batchCountTotal;
    }

    public int getBatchCountLeft() {
        return batchCountLeft;
    }

    public Date getExpiredDate() {
        return expiredDate;
    }
}
