package com.hp.common.exception;

import com.hp.common.api.IErrorCode;

/**
 * 自定义API异常
 */
public class ApiException extends RuntimeException{
    private IErrorCode errorCode;

    public ApiException(IErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public ApiException(String message){
        super(message);
    }

    public ApiException(Throwable cause, IErrorCode errorCode) {
        super(cause);
        this.errorCode = errorCode;
    }

    public IErrorCode getErrorCode(){
        return errorCode;
    }
}
