package com.anytimeroadtrips.model;

import com.anytimeroadtrips.model.base.AbstractObject;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@Table(name = "cars")
public class Car extends AbstractObject {

    @Column(name = "number_plate", nullable = false, unique = true)
    private String numberPlate;
}
