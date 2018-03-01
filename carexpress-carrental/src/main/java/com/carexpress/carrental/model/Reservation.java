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
@Table(name = "reservation", schema = "carexpress")
public class Reservation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7959596800569059446L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    
    @Temporal(TemporalType.DATE)
	@Column(name = "reservation_date", nullable = false)
	private Date reservationDate;
    
    @Temporal(TemporalType.TIME)
	@Column(name = "reservation_time", nullable = false)
    private Date reservationTime;
    
    @Column(name = "reservation_time_tz", nullable = false)
	private String reservationTimeTz;
    
    @Temporal(TemporalType.DATE)
	@Column(name = "return_date", nullable = false)
	private Date returnDate;
    
    @Temporal(TemporalType.TIME)
	@Column(name = "return_time", nullable = false)
    private Date returnTime;
    
    @Column(name = "return_time_tz", nullable = false)
	private String returnTimeTz;
    
    @Column(name = "customer_id", nullable = false)
    private Integer customerId;
    
    @Column(name = "reservation_location_id", nullable = false)
    private Integer reservationLocationId;

    @Column(name = "return_location_id", nullable = false)
    private Integer returnLocationId;
    
    @Column(name = "booking_agent_id", nullable = false)
    private Integer bookingAgentId;

    @Column(name = "return_agent_id", nullable = false)
    private Integer returnAgentId;
    
	@Column(name = "nbr_of_days", nullable = false, precision = 4, scale = 0)
    private Short nbrOfDays;
	
    @Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_time", nullable = false, length = 29)
    private Date dateTime;
    
    @Column(name = "date_time_tz", nullable = false)
    private String dateTimeTz;

	/**
	 * @return the reservationDate
	 */
	public synchronized Date getReservationDate() {
		return reservationDate;
	}

	/**
	 * @param reservationDate the reservationDate to set
	 */
	public synchronized void setReservationDate(Date reservationDate) {
		this.reservationDate = reservationDate;
	}

	/**
	 * @return the reservationTime
	 */
	public synchronized Date getReservationTime() {
		return reservationTime;
	}

	/**
	 * @param reservationTime the reservationTime to set
	 */
	public synchronized void setReservationTime(Date reservationTime) {
		this.reservationTime = reservationTime;
	}

	/**
	 * @return the reservationTimeTz
	 */
	public synchronized String getReservationTimeTz() {
		return reservationTimeTz;
	}

	/**
	 * @param reservationTimeTz the reservationTimeTz to set
	 */
	public synchronized void setReservationTimeTz(String reservationTimeTz) {
		this.reservationTimeTz = reservationTimeTz;
	}

	/**
	 * @return the returnDate
	 */
	public synchronized Date getReturnDate() {
		return returnDate;
	}

	/**
	 * @param returnDate the returnDate to set
	 */
	public synchronized void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	/**
	 * @return the returnTime
	 */
	public synchronized Date getReturnTime() {
		return returnTime;
	}

	/**
	 * @param returnTime the returnTime to set
	 */
	public synchronized void setReturnTime(Date returnTime) {
		this.returnTime = returnTime;
	}

	/**
	 * @return the returnTimeTz
	 */
	public synchronized String getReturnTimeTz() {
		return returnTimeTz;
	}

	/**
	 * @param returnTimeTz the returnTimeTz to set
	 */
	public synchronized void setReturnTimeTz(String returnTimeTz) {
		this.returnTimeTz = returnTimeTz;
	}

	/**
	 * @return the customerId
	 */
	public synchronized Integer getCustomerId() {
		return customerId;
	}

	/**
	 * @param customerId the customerId to set
	 */
	public synchronized void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	/**
	 * @return the reservationLocationId
	 */
	public synchronized Integer getReservationLocationId() {
		return reservationLocationId;
	}

	/**
	 * @param reservationLocationId the reservationLocationId to set
	 */
	public synchronized void setReservationLocationId(Integer reservationLocationId) {
		this.reservationLocationId = reservationLocationId;
	}

	/**
	 * @return the returnLocationId
	 */
	public synchronized Integer getReturnLocationId() {
		return returnLocationId;
	}

	/**
	 * @param returnLocationId the returnLocationId to set
	 */
	public synchronized void setReturnLocationId(Integer returnLocationId) {
		this.returnLocationId = returnLocationId;
	}

	/**
	 * @return the bookingAgentId
	 */
	public synchronized Integer getBookingAgentId() {
		return bookingAgentId;
	}

	/**
	 * @param bookingAgentId the bookingAgentId to set
	 */
	public synchronized void setBookingAgentId(Integer bookingAgentId) {
		this.bookingAgentId = bookingAgentId;
	}

	/**
	 * @return the returnAgentId
	 */
	public synchronized Integer getReturnAgentId() {
		return returnAgentId;
	}

	/**
	 * @param returnAgentId the returnAgentId to set
	 */
	public synchronized void setReturnAgentId(Integer returnAgentId) {
		this.returnAgentId = returnAgentId;
	}

	/**
	 * @return the nbrOfDays
	 */
	public synchronized Short getNbrOfDays() {
		return nbrOfDays;
	}

	/**
	 * @param nbrOfDays the nbrOfDays to set
	 */
	public synchronized void setNbrOfDays(Short nbrOfDays) {
		this.nbrOfDays = nbrOfDays;
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
	 * @return the id
	 */
	public synchronized Integer getId() {
		return id;
	}

    @Override
    public String toString() {
        return String.format(
                "Reservation[id=%d, reservationDate='%s', reservationTime='%s, reservationTimeTz=%s, returnDate=%s, returnTime=%s, returnTimeTz=%s, customerId=%d, reservationLocationId=%d, returnLocationId=%d, bookingAgentId=%d, returnAgentId=%d, nbrOfDays=%d, dateTime=%s, dateTimeTz=%s']",
                id, reservationDate.toString(), reservationTime.toString(), reservationTimeTz, returnDate.toString(), returnTime.toString(), returnTimeTz, customerId, reservationLocationId, returnLocationId, bookingAgentId, returnAgentId, nbrOfDays, dateTime.toString(), dateTimeTz);
    }
    
    
}
