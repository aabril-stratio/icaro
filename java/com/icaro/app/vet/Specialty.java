package com.icaro.app.vet;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.icaro.app.model.NamedEntity;

/**

 */
@Entity
@Table(name = "specialties")
public class Specialty extends NamedEntity implements Serializable {

}
