package dao;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public Long getTargetAmount() {
        return targetAmount;
    }

    public void setTargetAmount(Long targetAmount) {
        this.targetAmount = targetAmount;
    }

    public Date getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }

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
