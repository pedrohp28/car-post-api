package com.analytics.data.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "car_model_analytics")
@Data
@NoArgsConstructor
public class CarModelAnalyticsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String model;

    private Long posts;

}

