package com.tistory.eclipse4j.expedia.api.service;

public enum HotelSort {
    DEFAULT("정렬은 수익성에 맞게 최적화되어 있습니다."), //
    BUDGET("각 시장의 저가 호텔에 우선 순위가 적용되어 수익성 순으로 정렬됩니다. 조회에서 예약까지의 수익성 비율이 가장 높은 저가 호텔이 최상단에 배치됩니다."), //
    CHAMPION("각 시장의 중간급 호텔에 우선 순위가 적용되어 수익성 순으로 정렬됩니다. 조회에서 예약까지의 수익성 비율이 가장 높은 중간급 호텔이 최상단에 배치됩니다."), //
    PREMIUM("각 시장의 고급 호텔에 우선 순위가 적용되어 수익성 순으로 정렬됩니다. 조회에서 예약까지의 수익성 비율이 가장 높은 고급 호텔이 최상단에 배치됩니다."), //
    PROMO("프로모션 요금 또는 부가 서비스를 제공하는 숙박업소를 그렇지 않은 숙박업소보다 상위에 배치합니다."), //
    PRICE_AVERAGE(
            "평균 숙박비(오름차순) 별로 숙박 시설을 정렬합니다. 순서는 API에서 접속하는 숙박업소 목록에 적용되는 비즈니스/마케팅 사무 알고리즘으로 인해 완벽하지 않을 수 있습니다. 정확한 요금 정렬은 결과를 수신한 뒤 자체 코드 내에서 이루어집니다."), PRICE_REVERSE(
                    "숙박비(내림차순)별로 숙박업소를 정렬합니다. 위에서 설명한 것처럼 정렬이 완벽하지 않을 수 있습니다."), //
    QUALITY("호텔 등급(내림차순)별로 숙박업소를 정렬합니다."), //
    QUALITY_REVERSE(" 호텔 등급(오름차순)별로 숙박업소를 정렬합니다."), //
    PROXIMITY("latitude & longitude 매개변수에 따라 정의된 원점과의 거리에 따라 정렬합니다."), //
    TRIP_ADVISOR("승인된 TripAdvisor 통합이 있는 경우 이 값은 결과를 투숙객 평점이 높은 것부터 낮은 것 순서로 정렬합니다."), //
    NO_SORT("hotelIdList와만 함께 사용됩니다. 요청에 나열된 정확한 순서에 따라 호텔을 반환합니다."), //
    HIGH_MARGIN(
            "CHAMPION 정렬에 따라 HIGH_MARGIN 정렬이 한 단계 올라가 수익 백분율이 가장 높은 숙박 시설에 우선 순위가 부여됩니다. 따라서 전환율과 수익성이 높은 호텔이 상단에 배치됩니다. HIGH_MARGIN 정렬은 숙박 시설의 추가 비용을 고려하여 파트너의 수익 백분율에 우선 순위를 둡니다.");

    private String description;

    HotelSort(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}
