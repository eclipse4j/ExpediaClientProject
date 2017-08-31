package com.tistory.eclipse4j.expedia.api.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.assertj.core.util.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.tistory.eclipse4j.expedia.api.domain.HotelListResponse;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class HotelFindServiceSpringTest {

    @Autowired
    private HotelFindService hotelFindService;

    @Test
    public void test_도시로검색() {
        HotelFindCondition condition = new HotelFindCondition();
        condition.setCity("Newyork");
        condition.setArrivalDate(LocalDate.now().plusDays(60));
        condition.setDepartureDate(LocalDate.now().plusDays(62));
        condition.setNumberOfResults(1);

        RoomCondition roomCondition = new RoomCondition();
        roomCondition.setNumberOfAdults(2);
        condition.setRooms(Lists.newArrayList(roomCondition));
        HotelListResponse eanHotels = hotelFindService.findByCity(condition);
        
        eanHotels.getHotelList().getHotelSummary().stream().forEach(o->{
            log.info("[TEST] HotelId= {}",  o.getHotelId());
            log.info("[TEST] HotelName = {}",  o.getName());
        });
        
        assertNotNull(eanHotels);
        assertTrue(eanHotels.getHotelList().getSize() == 1);
    }
}
