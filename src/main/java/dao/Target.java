package dao;

import org.hibernate.annotations.Type;
import org.joda.time.LocalDate;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by user on 16.04.2017.
 */
public class Target {
    private Long id;
    private String target;
    private Long targetAmount;
    private LocalDate targetDate;
    private Set<Accumulation> accumulations = null;

    public Target() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, unique = true)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "TARGET", nullable = false, unique = true)
    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    @Column(name = "TARGET_AMOUNT", nullable = false, unique = true)
    public Long getTargetAmount() {
        return targetAmount;
    }

    public void setTargetAmount(Long targetAmount) {
        this.targetAmount = targetAmount;
    }

    @Column(name = "TARGET_DATE", nullable = false, unique = true)
    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
    public LocalDate getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "target")
    public Set<Accumulation> getAccumulations() {
        return accumulations;
    }

    public void setAccumulations(Set<Accumulation> accumulations) {
        this.accumulations = accumulations;
    }

    @Override
    public String toString() {
        return "Target{" +
                "id=" + id +
                ", target='" + target + '\'' +
                ", targetAmount=" + targetAmount +
                ", targetDate=" + targetDate +
                ", accumulations=" + accumulations +
                '}';
    }
}
