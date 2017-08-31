package com.tistory.eclipse4j.expedia.api.domain;

public enum CancelReasonType {
    HOC("호텔 측이 취소를 부탁함"),
    COP("계획 변경"),
    FBP("더 좋은 가격을 찾음"),
    FBH("더 좋은 호텔을 찾음"),
    CNL("계획이 취소됨"),
    NSY("명시하고 싶지 않음"),
    OTH("기타");
    
    CancelReasonType(String description){
        this.description = description;
    }
    
    private String description;
    
    public String getDescription(){
        return description;
    }
}
