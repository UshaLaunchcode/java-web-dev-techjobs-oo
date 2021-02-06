package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job(){
        id = nextId;
        nextId++;
    }

    public Job(String aName,Employer aEmployer, Location aLocation, PositionType aPositionType, CoreCompetency aCoreCompetency){
        this();
        this.name = aName;
        this.employer = aEmployer;
        this.location = aLocation;
        this.positionType= aPositionType;
        this.coreCompetency = aCoreCompetency;
    }


    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, employer, location, positionType, coreCompetency);
    }

    @Override
    public String toString() {
        if (this.getEmployer().toString().equals("")) {
          this.getEmployer().setValue("Data not available");

//            return "Data not available";

        }
        if(this.getName().equals("")){
            this.setName("Data not available");

        }
        if (this.getLocation().toString().equals("")) {
            this.getLocation().setValue("Data not available");

//
        }
        if (this.getPositionType().toString().equals("")) {
            this.getPositionType().setValue("Data not available");
//
        }
        if (this.getCoreCompetency().toString().equals("")) {
            this.getCoreCompetency().setValue("Data not available");
//
        }

            return "\n" + "ID: " + this.getId() +
                    "\n" + "Name: " + this.getName() +
                    "\n" + "Employer: " + this.getEmployer() +
                    "\n" + "Location: " + this.getLocation() +
                    "\n" + "Position Type: " + this.getPositionType() +
                    "\n" + "Core Competency: " + this.getCoreCompetency() +
                    "\n";


        }




    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
       // employer.getValue().toString() = "";
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }
}
