package dao;

import org.hibernate.annotations.Type;
import org.joda.time.LocalDate;
import javax.persistence.*;

/**
 * Created by user on 16.04.2017.
 */
public class Accumulation {
    private Long id;
    private Long amount;
    private LocalDate acDate;
    private Target target;
    private Long targetId;

    public Accumulation() {
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

    @Column(name = "AMOUNT", nullable = false, unique = true)
    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    @Column(name = "AC_DATE", nullable = false, unique = true)
    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
    public LocalDate getAcDate() {
        return acDate;
    }

    public void setAcDate(LocalDate acDate) {
        this.acDate = acDate;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "TARGET_ID", nullable = false)
    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    @Transient
    public Long getTargetId() {
        return targetId;
    }

    public void setTargetId(Long targetId) {
        this.targetId = targetId;
    }

    @Override
    public String toString() {
        return "Accumulation{" +
                "id=" + id +
                ", amount=" + amount +
                ", acDate=" + acDate +
                ", target=" + target +
                ", targetId=" + targetId +
                '}';
    }

    //    public void setDateAc(Date dateAc) {
//        this.dateAc = dateAc;
//    }
//
//    public Accumulation() {
//
//    }
//
//    public Accumulation(Long id, Double amount, Date dateAc) {
//        this.id = id;
//        this.amount = amount;
//        this.dateAc = dateAc;
//        this.targetId = targetId;
//    }
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "ID", nullable = false, unique = true)
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    @Column(name = "AMOUNT", nullable = false, unique = false)
//    public Double getAmount() {
//        return amount;
//    }
//
//    public void setAmount(Double amount) {
//        this.amount = amount;
//    }
//
//    @Column(name = "DATE_AC", nullable = false, unique = false)
//    public Date getDateAc() {
//        return dateAc;
//    }
//
//    public void setDateAc(String lastName) {
//        this.dateAc = dateAc;
//    }
//
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "TARGET_ID", nullable = false)
//    public Target getTarget() {
//        return target;
//    }
//
//    public void setTarget(Target target) {
//        this.target = target;
//    }
//
//    @Transient
//    public Long getTargetId() {
//        return targetId;
//    }
//
//    public void setTargetId(Long targetId) {
//        this.targetId = targetId;
//    }
//
//    @Override
//    public String toString() {
//        return new ToStringBuilder(this)
//                .append("id", id)
//                .append("amount", amount)
//                .append("dateAc", dateAc)
//                .toString();
//    }
}
