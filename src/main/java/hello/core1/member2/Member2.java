package hello.core1.member2;


import hello.core1.member2.Grade2;

public class Member2 {

    private Long id;
    private String name;
    private Grade2 grade;


    //생성자 생성
    public Member2(Long id, String name, Grade2 grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade2 getGrade() {
        return grade;
    }

    public void setGrade(Grade2 grade) {
        this.grade = grade;
    }
}

