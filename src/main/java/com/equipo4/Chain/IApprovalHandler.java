package com.equipo4.Chain;

public abstract class IApprovalHandler {
    protected IApprovalHandler nextHandler;

    public void setNextHandler(IApprovalHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handlerRequest(ChangeRequest request);
}
