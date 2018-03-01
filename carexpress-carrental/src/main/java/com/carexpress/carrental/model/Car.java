/**
 * 
 */
package com.carexpress.carrental.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author andymbrysoniii
 *
 */
@Entity
@Table(name = "car", schema = "carexpress")
public class Car implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2621612190927622957L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    
    @Column(name = "make", nullable = false)
    private String make;
    
    @Column(name = "model", nullable = false) 
    private String model;
    
	@Column(name = "year", nullable = false, precision = 4, scale = 0)
    private Short year;
	
	@Column(name = "description", nullable = false)
    private String description;
	
	@Column(name = "carclass", nullable = false)
    private String carClass;
	
	@Column(name = "rental_class", nullable = false)
    private String rentalClass;
	
	@Column(name = "color", nullable = false)
    private String color;
		
	@Column(name = "milage", nullable = false)
	private Integer mileage;
	
    @Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_time", nullable = false, length = 29)
    private Date dateTime;
    
    @Column(name = "date_time_tz", nullable = false)
    private String dateTimeTz;
    

	/**
	 * @return the id
	 */
	public synchronized Integer getId() {
		return id;
	}


	/**
	 * @return the make
	 */
	public synchronized String getMake() {
		return make;
	}




	/**
	 * @param make the make to set
	 */
	public synchronized void setMake(String make) {
		this.make = make;
	}




	/**
	 * @return the model
	 */
	public synchronized String getModel() {
		return model;
	}




	/**
	 * @param model the model to set
	 */
	public synchronized void setModel(String model) {
		this.model = model;
	}


	/**
	 * @return the year
	 */
	public synchronized Short getYear() {
		return year;
	}




	/**
	 * @param year the year to set
	 */
	public synchronized void setYear(Short year) {
		this.year = year;
	}


	/**
	 * @return the description
	 */
	public synchronized String getDescription() {
		return description;
	}




	/**
	 * @return the mileage
	 */
	public synchronized Integer getMileage() {
		return mileage;
	}




	/**
	 * @param mileage the mileage to set
	 */
	public synchronized void setMileage(Integer mileage) {
		this.mileage = mileage;
	}




	/**
	 * @param description the description to set
	 */
	public synchronized void setDescription(String description) {
		this.description = description;
	}




	/**
	 * @return the carClass
	 */	
	public synchronized String getCarClass() {
		return carClass;
	}



	/**
	 * @param carClass the carClass to set
	 */
	public synchronized void setCarClass(String carClass) {
		this.carClass = carClass;
	}




	/**
	 * @return the rentalClass
	 */	
	public synchronized String getRentalClass() {
		return rentalClass;
	}




	/**
	 * @param rentalClass the rentalClass to set
	 */
	public synchronized void setRentalClass(String rentalClass) {
		this.rentalClass = rentalClass;
	}



	/**
	 * @return the color
	 */	
	public synchronized String getColor() {
		return color;
	}



	/**
	 * @param color the color to set
	 */
	public synchronized void setColor(String color) {
		this.color = color;
	}




	/**
	 * @return the dateTimeTz
	 */
	public synchronized String getDateTimeTz() {
		return dateTimeTz;
	}




	/**
	 * @param dateTimeTz the dateTimeTz to set
	 */
	public synchronized void setDateTimeTz(String dateTimeTz) {
		this.dateTimeTz = dateTimeTz;
	}




	/**
	 * @return the dateTime
	 */

	public synchronized Date getDateTime() {
		return dateTime;
	}




	/**
	 * @param dateTime the dateTime to set
	 */
	public synchronized void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	
    @Override
    public String toString() {
        return String.format(
                "Car[id=%d, make='%s', model='%s, year=%d, description=%s, carClass=%s, rentalClass=%s, color=%s, mileage=%d, dateTime=%s, dateTimeTz=%s']",
                id, make, model, year, description, carClass, rentalClass, color, mileage, dateTime.toString(), dateTimeTz);
    }
}
