package model;

import java.util.ArrayList;


public class PersonDirectory {
    
    private ArrayList<Person> personDirectory;
    
    public PersonDirectory() {
        personDirectory = new ArrayList<>();
    }
    
    public ArrayList<Person> getPersonHistory() {
        return personDirectory;
    }
    
    public void setPersonHistory(ArrayList<Person> personHistory) {
        this.personDirectory = personHistory;
    }
    
    public Person createAndAddPerson() {
        Person person = new Person();
        personDirectory.add(person);
        return person;
    }
    
    public void deletePerson(Person person) {
        personDirectory.remove(person);
    }
    
    public ArrayList<Person> searchPatient(String key)
    {
        ArrayList<Person> searchPatientDirectory = new ArrayList();
        for(Person person: personDirectory)
        {
            if(person.getPersonName().toLowerCase().startsWith(key.toLowerCase()))
            {
                if(person.getPatient()!=null)
                {
                    searchPatientDirectory.add(person);
                }
            }
            if(String.valueOf(person.getAge()).toLowerCase().startsWith(key.toLowerCase()))
            {
                if(person.getPatient()!=null)
                {
                    searchPatientDirectory.add(person);
                }
            }
            if(String.valueOf(person.getweight()).toLowerCase().startsWith(key.toLowerCase()))
            {
                searchPatientDirectory.add(person);
            }
            if(person.getCity().toLowerCase().startsWith(key.toLowerCase()))
            {
                searchPatientDirectory.add(person);
            }
            if(person.getCommunity().toLowerCase().startsWith(key.toLowerCase()))
            {
                searchPatientDirectory.add(person);
            }
            if(person.getAddress().toLowerCase().startsWith(key.toLowerCase()))
            {
                searchPatientDirectory.add(person);
            }
        }
        return searchPatientDirectory;
    }
    
    public ArrayList<Person> searchPerson(String key)
    {
        ArrayList<Person> searchPersonDirectory = new ArrayList();
        for(Person person: personDirectory)
        {
            if(person.getPersonName().toLowerCase().startsWith(key.toLowerCase()))
            {
                searchPersonDirectory.add(person);
            }
            if(String.valueOf(person.getAge()).toLowerCase().startsWith(key.toLowerCase()))
            {
                searchPersonDirectory.add(person);
            }
            if(String.valueOf(person.getweight()).toLowerCase().startsWith(key.toLowerCase()))
            {
                searchPersonDirectory.add(person);
            }
            if(person.getCity().toLowerCase().startsWith(key.toLowerCase()))
            {
                searchPersonDirectory.add(person);
            }
            if(person.getCommunity().toLowerCase().startsWith(key.toLowerCase()))
            {
                searchPersonDirectory.add(person);
            }
            if(person.getAddress().toLowerCase().startsWith(key.toLowerCase()))
            {
                searchPersonDirectory.add(person);
            }
        }
        
        return searchPersonDirectory;
    }
}