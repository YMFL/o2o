package com.imooc.o2o.exceptions;

public class ProductOperationException extends RuntimeException {

    private static final long serialVersionUID = 5076172298827469013L;

    /**
     *
     * @param msg
     */
    public ProductOperationException(String msg) {
        super(msg);
    }
}
