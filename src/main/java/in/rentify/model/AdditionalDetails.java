package in.rentify.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Data
@Table(name = "property_details")
public class AdditionalDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pid;
    private Integer age;
    private Integer bathrooms;
    private Double deposit;
    private String balcony;
    private String highlights;
    private String facingDirection;
    private String accessibility;
    private String utilities;
    private String security;
    private String leaseTerms;
    private Boolean carParking;
    private String furnishing;
    private String amenities;
    
    @OneToOne
    @JoinColumn(name = "property_id")
    @JsonBackReference
    private Property property;

	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getBathrooms() {
		return bathrooms;
	}

	public void setBathrooms(Integer bathrooms) {
		this.bathrooms = bathrooms;
	}

	public Double getDeposit() {
		return deposit;
	}

	public void setDeposit(Double deposit) {
		this.deposit = deposit;
	}

	public String getBalcony() {
		return balcony;
	}

	public void setBalcony(String balcony) {
		this.balcony = balcony;
	}

	public String getHighlights() {
		return highlights;
	}

	public void setHighlights(String highlights) {
		this.highlights = highlights;
	}

	public String getFacingDirection() {
		return facingDirection;
	}

	public void setFacingDirection(String facingDirection) {
		this.facingDirection = facingDirection;
	}

	public String getAccessibility() {
		return accessibility;
	}

	public void setAccessibility(String accessibility) {
		this.accessibility = accessibility;
	}

	public String getUtilities() {
		return utilities;
	}

	public void setUtilities(String utilities) {
		this.utilities = utilities;
	}

	public String getSecurity() {
		return security;
	}

	public void setSecurity(String security) {
		this.security = security;
	}

	public String getLeaseTerms() {
		return leaseTerms;
	}

	public void setLeaseTerms(String leaseTerms) {
		this.leaseTerms = leaseTerms;
	}

	public Boolean getCarParking() {
		return carParking;
	}

	public void setCarParking(Boolean carParking) {
		this.carParking = carParking;
	}

	public String getFurnishing() {
		return furnishing;
	}

	public void setFurnishing(String furnishing) {
		this.furnishing = furnishing;
	}

	public String getAmenities() {
		return amenities;
	}

	public void setAmenities(String amenities) {
		this.amenities = amenities;
	}

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}

	@Override
	public String toString() {
		return "AdditionalDetails [pid=" + pid + ", age=" + age + ", bathrooms=" + bathrooms + ", deposit=" + deposit
				+ ", balcony=" + balcony + ", highlights=" + highlights + ", facingDirection=" + facingDirection
				+ ", accessibility=" + accessibility + ", utilities=" + utilities + ", security=" + security
				+ ", leaseTerms=" + leaseTerms + ", carParking=" + carParking + ", furnishing=" + furnishing
				+ ", amenities=" + amenities + ", property=" + property + "]";
	}
    
    
}
