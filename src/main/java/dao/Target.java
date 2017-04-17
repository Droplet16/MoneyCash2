package dao;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * Created by user on 16.04.2017.
 */
public class Target {
    private Long id;
    private String target;
    private Long targetAmount;
    private Date targetDate;
    private Set<Accumulation> accumulations = null;

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
    public Date getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Date targetDate) {
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
