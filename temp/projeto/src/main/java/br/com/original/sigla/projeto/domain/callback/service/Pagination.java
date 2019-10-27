package br.com.pedro.trampo.domain.callback.service;

public class Pagination {
    private int number;
    private int  lengthPage;


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getLengthPage() {
        return lengthPage;
    }

    public void setLengthPage(int lengthPage) {
        this.lengthPage = lengthPage;
    }
}
