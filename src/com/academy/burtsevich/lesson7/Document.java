package com.academy.burtsevich.lesson7;

import java.io.Serializable;
import java.util.Objects;

public class Document implements Printable, Cloneable, Comparable<Document>, Serializable {
    private String docsName;
    private int numberOfPages;
    private boolean relevance = true;

    private static final long SERIAL_VERSION_UID = 1L;

    public Document() {
    }

    public Document(String docsName, int numberOfPages) {
        this.docsName = docsName;
        this.numberOfPages = numberOfPages;
    }

    public Document(String docsName, int numberOfPages, boolean relevance) {
        this.docsName = docsName;
        this.numberOfPages = numberOfPages;
        this.relevance = relevance;
    }

    public String getDocsName() {
        return docsName;
    }

    public void setRelevance(boolean relevance) {
        this.relevance = relevance;
    }

    public boolean isRelevance() {
        return relevance;
    }
    public void setDocsName(String docsName) {
        this.docsName = docsName;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public Document clone() throws CloneNotSupportedException {
        return (Document) super.clone();

    }

    @Override
    public int compareTo(Document comparedDoc) {
        int result = this.numberOfPages - comparedDoc.numberOfPages;
        if (result < 0){
            return -1;
        } else if (result > 0){
            return 1;
        }
        return 0;
    }
    @Override
    public String toString(){
        return "Document \"" + this.docsName + "\", " + this.numberOfPages + " стр.";
    }

    @Override
    public boolean equals(Object other){
        if (this == other){
            return true;
        }
        if (other == null | !(other instanceof Document)){
            return false;
        } else {
            Document doc = (Document) other;
            return Objects.equals(this.docsName, doc.docsName) && Objects.equals(this.numberOfPages, doc.numberOfPages);
        }
    }

    @Override
    public int hashCode() {
        final int PRIME = 31;
        int result = 1;
        result = PRIME * result + this.numberOfPages;
        result = PRIME * result + ((this.docsName == null) ? 0 : this.docsName.hashCode());
        return result;
//        return Objects.hash(docsName, numberOfPages);  // А почему бы не воспользоваться стандартным методом?
    }
}
