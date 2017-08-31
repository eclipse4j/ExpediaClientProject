package com.tistory.eclipse4j.expedia.api.service;

public enum ApiExperience {
    PARTNER_CALL_CENTER("콜센터 담당자 요청"),
    PARTNER_WEBSITE("고객용 웹 사이트 요청"),
    PARTNER_MOBILE_WEB("모바일 형식 웹 사이트 요청"),
    PARTNER_MOBILE_APP("모바일 앱 요청"),
    PARTNER_BOT_CACHE("캐시 봇 요청"),
    PARTNER_BOT_REPORTING("보고 봇 요청"),
    PARTNER_AFFILIATE("고유 제휴사 기반으로 서비스하는 API/플랫폼 요청");
    
    private String description;
    
    ApiExperience(String description){
        this.description = description;
    }
    
    public String getDescription(){
        return this.description;
    }

    public static ApiExperience to(String apiExperience) {
        ApiExperience[] apiExperiences = ApiExperience.values();
        for (ApiExperience experience : apiExperiences) {
            if( experience.name().equals(apiExperience)){
                return experience;
            }
        }
        return null;
    }
}
