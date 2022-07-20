package com.codewithsufyan;

public class D02_OOC_05 {
    public static void main(String[] args) {
        Associate associate = new Associate();
        associate.setAssociateId(1234);

        associate.trackAssociateStatus(12);
        associate.trackAssociateStatus(21);
        associate.trackAssociateStatus(41);
        associate.trackAssociateStatus(61);
    }
}

class Associate {
    int associateId;
    String associateName;
    String workStatus;

    public Associate() {
    }

    public Associate(int associateId, String associateName, String workStatus) {
        this.associateId = associateId;
        this.associateName = associateName;
        this.workStatus = workStatus;
    }

    public int getAssociateId() {
        return associateId;
    }

    public void setAssociateId(int associateId) {
        this.associateId = associateId;
    }

    public String getAssociateName() {
        return associateName;
    }

    public void setAssociateName(String associateName) {
        this.associateName = associateName;
    }

    public String getWorkStatus() {
        return workStatus;
    }

    public void setWorkStatus(String workStatus) {
        this.workStatus = workStatus;
    }

    void trackAssociateStatus(int no_of_days) {
        if (no_of_days <= 20) {
            setWorkStatus("Core Skills");
            System.out.println(workStatus);
        } else if (no_of_days>20 && no_of_days<=40) {
            setWorkStatus("Advanced Modules");
            System.out.println(workStatus);
        } else if (no_of_days>40 && no_of_days<=60) {
            setWorkStatus("Project Phase");
            System.out.println(workStatus);
        }else {
            setWorkStatus("Deployed in project");
            System.out.println(workStatus);
        }
    }
}
