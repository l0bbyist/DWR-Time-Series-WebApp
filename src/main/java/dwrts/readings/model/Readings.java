package dwrts.readings.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
//@Table(name="device")
public class Readings {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer location_ID;

    //@Column(name="dev_NAME", nullable=false)
    private String location_NAME;

    //@Column(name="SERIAL")
    private String Parameter;

    @Column(columnDefinition = "timestamp(6)")
    private LocalDateTime Scheduled;

    @Column(name = "\"timestamp\"", columnDefinition = "timestamp(6)")
    private LocalDateTime Timestamp;

    @Column(columnDefinition = "timestamp(6)")
    private LocalDateTime ReadTime;

    //@Column(name="DATE_ADDED")
    private String Value;

    //@Column(name="DATE_ADDED")
    private String Unit;

    //@Column(name="DATE_ADDED")
    private String Quality;

    //@Column(name="DATE_ADDED")
    private String Reader;

    // Constructors
    public Readings() {}

    public Readings(Integer location_ID, String location_NAME, String Parameter, LocalDateTime Scheduled, LocalDateTime Timestamp, LocalDateTime ReadTime, String Value, String Unit, String Quality, String Reader) {
        this.location_ID = location_ID;
        this.location_NAME = location_NAME;
        this.Parameter = Parameter;
        this.Scheduled = Scheduled;
        this.Timestamp = Timestamp;
        this.ReadTime = ReadTime;
        this.Value = Value;
        this.Unit = Unit;
        this.Quality = Quality;
        this.Reader = Reader;
    }

    // Getters and Setters
    public Integer getLocation_ID() {
        return location_ID;
    }

    public void setLocation_ID(Integer location_ID) {
        this.location_ID = location_ID;
    }

    public String getLocation_NAME() {
        return location_NAME;
    }

    public void setLocation_NAME(String location_NAME) {
        this.location_NAME = location_NAME;
    }

    public String getParameter() {
        return Parameter;
    }

    public void setParameter(String Parameter) {
        this.Parameter = Parameter;
    }

    public LocalDateTime getScheduled() {
        return Scheduled;
    }

    public void setScheduled(LocalDateTime Scheduled) {
        this.Scheduled = Scheduled;
    }

    public LocalDateTime getTimestamp() {
        return Timestamp;
    }

    public void setTimestamp(LocalDateTime Timestamp) {
        this.Timestamp = Timestamp;
    }

    public LocalDateTime getReadTime() {
        return ReadTime;
    }

    public void setReadTime(LocalDateTime ReadTime) {
        this.ReadTime = ReadTime;
    }

    public String getValue() {
        return Value;
    }

    public void setValue(String Value) {
        this.Value = Value;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    public String getQuality() {
        return Quality;
    }

    public void setQuality(String Quality) {
        this.Quality = Quality;
    }

    public String getReader() {
        return Reader;
    }

    public void setReader(String Reader) {
        this.Reader = Reader;
    }
}