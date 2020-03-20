package kr.co.fastcampus.eatgo.domain;

import java.util.List;

public interface RestaurantRepository {
    List<Restaurant> findAll();

    Restaurant findbyId(Long id);
}
