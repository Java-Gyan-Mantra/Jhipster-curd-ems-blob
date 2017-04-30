package com.dugu.jhip.ems.domain;


import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 * A Employee.
 */
@Entity
@Table(name = "employee")
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "dept")
    private String dept;

    @Column(name = "gender")
    private String gender;

    @Column(name = "age")
    private Integer age;

    @Column(name = "exp")
    private Integer exp;

    @Column(name = "domain")
    private String domain;

    @Column(name = "join_date")
    private LocalDate joinDate;

    @NotNull
    @Lob
    @Column(name = "photo", nullable = false)
    private byte[] photo;

    @Column(name = "photo_content_type", nullable = false)
    private String photoContentType;

    @Column(name = "uniqu_id")
    private String uniquId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Employee name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public Employee dept(String dept) {
        this.dept = dept;
        return this;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getGender() {
        return gender;
    }

    public Employee gender(String gender) {
        this.gender = gender;
        return this;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public Employee age(Integer age) {
        this.age = age;
        return this;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getExp() {
        return exp;
    }

    public Employee exp(Integer exp) {
        this.exp = exp;
        return this;
    }

    public void setExp(Integer exp) {
        this.exp = exp;
    }

    public String getDomain() {
        return domain;
    }

    public Employee domain(String domain) {
        this.domain = domain;
        return this;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public Employee joinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
        return this;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public Employee photo(byte[] photo) {
        this.photo = photo;
        return this;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public String getPhotoContentType() {
        return photoContentType;
    }

    public Employee photoContentType(String photoContentType) {
        this.photoContentType = photoContentType;
        return this;
    }

    public void setPhotoContentType(String photoContentType) {
        this.photoContentType = photoContentType;
    }

    public String getUniquId() {
        return uniquId;
    }

    public Employee uniquId(String uniquId) {
        this.uniquId = uniquId;
        return this;
    }

    public void setUniquId(String uniquId) {
        this.uniquId = uniquId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Employee employee = (Employee) o;
        if (employee.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, employee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Employee{" +
            "id=" + id +
            ", name='" + name + "'" +
            ", dept='" + dept + "'" +
            ", gender='" + gender + "'" +
            ", age='" + age + "'" +
            ", exp='" + exp + "'" +
            ", domain='" + domain + "'" +
            ", joinDate='" + joinDate + "'" +
            ", photo='" + photo + "'" +
            ", photoContentType='" + photoContentType + "'" +
            ", uniquId='" + uniquId + "'" +
            '}';
    }
}
