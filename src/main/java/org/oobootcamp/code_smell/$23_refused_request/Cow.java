package org.oobootcamp.code_smell.$23_refused_request;

public class Cow extends Animal {
    @Override
    public void provide() {
        milk();
    }
}
