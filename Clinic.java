//SENG1110 Assignment One - James Wilce - c3236186
//Please note: I understand there are still some issues with this code, it was a challenge! Thanks for marking this

  //package name

import java.util.*;


public class Clinic //name of class
{
	Scanner command = new Scanner(System.in);
	
	Doctor firstDoctor = new Doctor(); //Initializes variable for firstDoctor
    Doctor secondDoctor = new Doctor(); //Initializes variable for secondDoctor
    String noDoctorAssigned = "No doctor assigned"; //Initializes variable for noDoctorAssigned

    Pet firstPet = new Pet(); //Initializes variable for firstPet
    Pet secondPet = new Pet(); //Initializes variable for secondPet
    Pet thirdPet = new Pet(); //Initializes variable for thirdPet
    Pet fourthPet = new Pet(); //Initializes variable for fourth
    
	private void run() 
	{

	System.out.println("Vetinarian Management Software");

    System.out.println("Enter command(help for list of commands): ");
    boolean running = true;

    while(running){

        switch(command.nextLine()){

        case "help":
        	System.out.println("");
            System.out.println("help            -  displays list of commands");
            System.out.println("list doctors    -  lists doctors");
            System.out.println("list pets       -  lists pets");
            System.out.println("add doctor      -  adds doctor");
            System.out.println("add pet         -  adds pet");
            System.out.println("remove doctor   -  removes doctor");
            System.out.println("remove pet      -  removes pet");
            System.out.println("exit            -  quits the program");
            System.out.println("");
            System.out.println("Please enter another command:");
            break;
            
//If user inputs 'add doctor' the following code will execute
        case "add doctor":
            addDoctor();
            break;


//SECTION - ADD PET
        case "add pet":
             addPet();
            break;
            
//When user inputs "assign doctor" will begin process of assigning a doctor to a pet            
       case "assign doctor":
    	   assignDoctor();
    	   
            break;

//LIST DOCTORS IN VARIABLE
        case "list doctors":
        	listDoctors();
                break;
                
 //CODE FOR LISTING STORED PETS
        case "list pets":
        	listPets();
        	
        	break;

        case "remove doctor":
        	removeDoctor();
        	break;
        	
        case "remove pet":
        	removePet();
            break;
            
        case "analyse pet":
        	analysePet();
        	break;
          
        case "exit":
            running = false;
            break;

        default:
            System.out.println("Please enter another command:");
            break;
            

        }
        
    }
        }
	private void addPet() {
       	
//Enter Pet Name
   	System.out.println("Enter name of pet: ");
   	String petName = command.nextLine();
           System.out.println("");
   	

//Select dog or cat
           System.out.println("Enter type: 1 for dog, 2 for cat");
   	int petType = command.nextInt();
           System.out.println("");
           
//Select pet size
   	System.out.println("Enter size: 1 for small, 2 for medium and 3 for large ");
   	int petSize = command.nextInt();
           System.out.println("");
           
//Enter pet weight
           System.out.println("Enter weight: ");
   	double petWeight = command.nextDouble();
           System.out.println("");
           
           if (petWeight <= 0) {
           	System.out.println("Pet Weight must be greater than 0. ");
           }
           	               
//Enter pet age
           System.out.println("Enter age: ");   
           int petAge = command.nextInt();
           System.out.println("");
//Tests if pet age is greater than zero             
           if (petAge <= 0) {
           	System.out.println("Pet age must be greater than 0. ");
           }
           
//Initialises variables
           String firstPetName = firstPet.getName();
           String secondPetName = secondPet.getName();
           String thirdPetName = thirdPet.getName();
           String fourthPetName = fourthPet.getName();
           
               if (firstPetName == "") {
               firstPet.setName(petName);
               firstPet.setAge(petAge);
               firstPet.setWeight(petWeight);
               
              
               
       switch (petType) {
           case 1:
               firstPet.setType("dog");
               break;
           case 2:
               firstPet.setType("cat");
               break;
           default:
               System.out.println("Error! Enter either 1 or 2");
               break;      
       }
       
       switch (petSize) {
           case 1:
               firstPet.setSize("small");
               break;
           case 2:
               firstPet.setSize("medium");
               break;
           case 3:
               firstPet.setSize("large");
               break;
           default:
               System.out.println("Error! Enter either 1, 2 or 3");
               break;
       }
           }
       
               else if (secondPetName == "") {
               secondPet.setName(petName);
               secondPet.setAge(petAge);
               secondPet.setWeight(petWeight);
              
       switch (petSize) {
           case 1:
               secondPet.setSize("small");
               break;
           case 2:
               secondPet.setSize("medium");
               break;
           case 3:
               secondPet.setSize("large");
               break;
           default:
               System.out.println("Error! Enter either 1, 2 or 3");
               break;
       }
       
       switch (petType) {
           case 1:
               secondPet.setType("dog");
               break;
           case 2:
               secondPet.setType("cat");
               break;
           default:
               System.out.println("Error! Enter either 1 or 2");
               break;      
       } 
       }
       
               else if (thirdPetName == "") {
               thirdPet.setName(petName);
               thirdPet.setAge(petAge);
               thirdPet.setWeight(petWeight);
       switch (petSize) {
           case 1:
               thirdPet.setSize("small");
               break;
           case 2:
               thirdPet.setSize("medium");
               break;
           case 3:
               thirdPet.setSize("large");
               break;
           default:
               System.out.println("Error! Enter either 1, 2 or 3");
               break;
       }
       
       switch (petType) {
           case 1:
               thirdPet.setType("dog");
               break;
           case 2:
               thirdPet.setType("cat");
               break;
           default:
               System.out.println("Error! Enter either 1 or 2");
               break;      
       }
       }
       
               else if (fourthPetName == "") {
               fourthPet.setName(petName);
               fourthPet.setAge(petAge);
               fourthPet.setWeight(petWeight);
       switch (petSize) {
           case 1:
               fourthPet.setSize("small");
               break;
           case 2:
               fourthPet.setSize("medium");
               break;
           case 3:
               fourthPet.setSize("large");
               break;
           default:
               System.out.println("Error! Enter either 1, 2 or 3");
               break;
       }
       
       switch (petType) {
           case 1:
               fourthPet.setType("dog");
               break;
           case 2:
               fourthPet.setType("cat");
               break;
           default:
               System.out.println("Error! Enter either 1 or 2");
               break;      
       }
   } else {
               System.out.println("Too many pets!");
           } 
           System.out.println("");
	}
	
	private void assignDoctor() {
		//Initialises variables            
        String _firstPetName = firstPet.getName();
        String _secondPetName = secondPet.getName();
        String _thirdPetName = thirdPet.getName();
        String _fourthPetName = fourthPet.getName();

//Prompts lists of pets available for assignment            
        System.out.println("List of all pets:");
        System.out.println("1.");
        System.out.println(_firstPetName);
        System.out.println("2.");
        System.out.println(_secondPetName);
        System.out.println("3.");
        System.out.println(_thirdPetName);
        System.out.println("4.");
        System.out.println(_fourthPetName);
        System.out.println("Please select the pet that you would like to assign a doctor to and enter its corresponding number:");
        
        int petAssignInt = command.nextInt();
        
        System.out.println("Please enter doctor name:");
        
        command.nextLine();
    	String doctorAssignString = command.nextLine();

//IF Statement for assigning input to respective pets        	
        if (petAssignInt == 1) {
        	firstPet.setDoctorName(doctorAssignString);
        	
        } else if(petAssignInt == 2) {
        	secondPet.setDoctorName(doctorAssignString);
        	
        } else if(petAssignInt == 3) {
        	thirdPet.setDoctorName(doctorAssignString);
        }
        else if(petAssignInt == 4) {
        	fourthPet.setDoctorName(doctorAssignString);
        	
        } else {
        	System.out.println("That is not a valid input. ");
        	
        }
	}
	
	private void listDoctors() {

        String _firstDoctorName = firstDoctor.getName();
        String _secondDoctorName = secondDoctor.getName();

        
//TESTS IF DOCTORS EXIST
     if (_firstDoctorName == "" && _secondDoctorName == ""){
     System.out.print(("There are currently no doctors in the system. "));
     System.out.println("");
     } else {
             if (_firstDoctorName == "") {
             	System.out.println(""); 
                 System.out.println("No first doctor!");
                 System.out.println("");
                 System.out.println("Name:");
                 System.out.println(secondDoctor.getName());
                 System.out.println("Specialty:");
                 System.out.println(secondDoctor.getSpec());
                 
                 
                 System.out.println("Assigned Pets:");
                 if (_secondDoctorName.equals(firstPet.getDoctorName())) {
              	   System.out.println(firstPet.getName());
                 } 
                 if (_secondDoctorName.equals(secondPet.getDoctorName())) {
               	   System.out.println(secondPet.getName());
                  }
                 if (_secondDoctorName.equals(thirdPet.getDoctorName())) {
                	   System.out.println(thirdPet.getName());
                  } 
                 if (_secondDoctorName.equals(fourthPet.getDoctorName())) {
                	   System.out.println(fourthPet.getName());
                  }


                 System.out.println("");
                 System.out.println("Please enter another command:");

             } else if (_secondDoctorName == "") {
                 System.out.println("Name:");
                 System.out.println(firstDoctor.getName());
                 System.out.println("Specialty:");
                 System.out.println(firstDoctor.getSpec());
                 
                 
                 System.out.println("Assigned Pets:");
                 if (_firstDoctorName.equals(firstPet.getDoctorName())) {
              	   System.out.println(firstPet.getName());
                 } 
                 if (_firstDoctorName.equals(secondPet.getDoctorName())) {
               	   System.out.println(secondPet.getName());
                  }
                 if (_firstDoctorName.equals(thirdPet.getDoctorName())) {
                	   System.out.println(thirdPet.getName());
                  } 
                 if (_firstDoctorName.equals(fourthPet.getDoctorName())) {
                	   System.out.println(fourthPet.getName());
                  }

                 
           System.out.println("");
           System.out.println("No second doctor!");
           System.out.println("");
           System.out.println("Please enter another command:");

             } else if (_secondDoctorName != "" && _firstDoctorName!= "") {
                 System.out.println("Name:");
                 System.out.println(firstDoctor.getName());
                 System.out.println("Specialty:");
                 System.out.println(firstDoctor.getSpec());
                 
                 System.out.println("Assigned Pets:");
                 if (_firstDoctorName.equals(firstPet.getDoctorName())) {
              	   System.out.println(firstPet.getName());
                 } 
                 if (_firstDoctorName.equals(secondPet.getDoctorName())) {
               	   System.out.println(secondPet.getName());
                  }
                 if (_firstDoctorName.equals(thirdPet.getDoctorName())) {
                	   System.out.println(thirdPet.getName());
                  } 
                 if (_firstDoctorName.equals(fourthPet.getDoctorName())) {
                	   System.out.println(fourthPet.getName());
                  }

                 System.out.println("");
                 System.out.println("Name:");
                 System.out.println(secondDoctor.getName());
                 System.out.println("Specialty:");
                 System.out.println(secondDoctor.getSpec());
                 
                 
                 System.out.println("Assigned Pets:");
                 if (_secondDoctorName.equals(firstPet.getDoctorName())) {
              	   System.out.println(firstPet.getName());
                 } 
                 if (_secondDoctorName.equals(secondPet.getDoctorName())) {
               	   System.out.println(secondPet.getName());
                  }
                 if (_secondDoctorName.equals(thirdPet.getDoctorName())) {
                	   System.out.println(thirdPet.getName());
                  } 
                 if (_secondDoctorName.equals(fourthPet.getDoctorName())) {
                	   System.out.println(fourthPet.getName());
                  }


                 System.out.println("");
                 System.out.println("Please enter another command:");
         }
     }
	}
	
	private void listPets() {
		
	String _firstPetName1 = firstPet.getName();
	String _secondPetName1 = secondPet.getName();
	String _thirdPetName1 = thirdPet.getName();
	String _fourthPetName1 = fourthPet.getName();
	
//Tests if there are any pets saved	
	if (_firstPetName1 == "" && _secondPetName1 == "" && _thirdPetName1 == "" && _fourthPetName1 == "") {
		System.out.println("There are currently no pets in the system. ");
		System.out.println("");
	} else {
		
//tests if there is a pet in firstPetName
		if (_firstPetName1 == "") {
			System.out.println("No first pet!");
			System.out.println("");
			
            System.out.println("Name:");
            System.out.println(secondPet.getName());
            System.out.println("Type:");
            System.out.println(secondPet.getType());
            System.out.println("Size:");
            System.out.println(secondPet.getSize());
            System.out.println("Weight:");
            System.out.println(secondPet.getWeight());
            System.out.println("Age:");
            System.out.println(secondPet.getAge());
            System.out.println("Doctor:");
            System.out.println(secondPet.getDoctorName());
            System.out.println("");
            
            System.out.println("");
            System.out.println("Name:");
            System.out.println(thirdPet.getName());
            System.out.println("Type:");
            System.out.println(thirdPet.getType());
            System.out.println("Size:");
            System.out.println(thirdPet.getSize());
            System.out.println("Weight:");
            System.out.println(thirdPet.getWeight());
            System.out.println("Age:");
            System.out.println(thirdPet.getAge());
            System.out.println("Doctor:");
            System.out.println(thirdPet.getDoctorName());
            System.out.println("");
            
            System.out.println("");
            System.out.println("Name:");
            System.out.println(fourthPet.getName());
            System.out.println("Type:");
            System.out.println(fourthPet.getType());
            System.out.println("Size:");
            System.out.println(fourthPet.getSize());
            System.out.println("Weight:");
            System.out.println(fourthPet.getWeight());
            System.out.println("Age:");
            System.out.println(fourthPet.getAge());
            System.out.println("Doctor:");
            System.out.println(fourthPet.getDoctorName());
            System.out.println("");
            
            System.out.println("");
            System.out.println("Please enter another command:");

            //Tests if there is a pet in secondPetName              
		} else if (_secondPetName1 == "") {
			System.out.println("");
            System.out.println("Name:");
            System.out.println(firstPet.getName());
            System.out.println("Type:");
            System.out.println(firstPet.getType());
            System.out.println("Size:");
            System.out.println(firstPet.getSize());
            System.out.println("Weight:");
            System.out.println(firstPet.getWeight());
            System.out.println("Age:");
            System.out.println(firstPet.getAge());
            System.out.println("Doctor:");
            System.out.println(firstPet.getDoctorName());
            System.out.println("");
			
            System.out.println("No second pet in system.");
            System.out.println("");
            
            System.out.println("");
            System.out.println("Name:");
            System.out.println(thirdPet.getName());
            System.out.println("Type:");
            System.out.println(thirdPet.getType());
            System.out.println("Size:");
            System.out.println(thirdPet.getSize());
            System.out.println("Weight:");
            System.out.println(thirdPet.getWeight());
            System.out.println("Age:");
            System.out.println(thirdPet.getAge());
            System.out.println("Doctor:");
            System.out.println(thirdPet.getDoctorName());
            System.out.println("");
            
            System.out.println("");
            System.out.println("Name:");
            System.out.println(fourthPet.getName());
            System.out.println("Type:");
            System.out.println(fourthPet.getType());
            System.out.println("Size:");
            System.out.println(fourthPet.getSize());
            System.out.println("Weight:");
            System.out.println(fourthPet.getWeight());
            System.out.println("Age:");
            System.out.println(fourthPet.getAge());
            System.out.println("Doctor:");
            System.out.println(fourthPet.getDoctorName());
            System.out.println("");
            
            System.out.println("");
            System.out.println("Please enter another command:");
            
  //Tests if there is a pet in thirdPetName
            
		} else if (_thirdPetName1 == "") {
			System.out.println("");
            System.out.println("Name:");
            System.out.println(firstPet.getName());
            System.out.println("Type:");
            System.out.println(firstPet.getType());
            System.out.println("Size:");
            System.out.println(firstPet.getSize());
            System.out.println("Weight:");
            System.out.println(firstPet.getWeight());
            System.out.println("Age:");
            System.out.println(firstPet.getAge());
            System.out.println("Doctor:");
            System.out.println(firstPet.getDoctorName());
            System.out.println("");
            
            System.out.println("");
            System.out.println("Name:");
            System.out.println(secondPet.getName());
            System.out.println("Type:");
            System.out.println(secondPet.getType());
            System.out.println("Size:");
            System.out.println(secondPet.getSize());
            System.out.println("Weight:");
            System.out.println(secondPet.getWeight());
            System.out.println("Age:");
            System.out.println(secondPet.getAge());
            System.out.println("Doctor:");
            System.out.println(secondPet.getDoctorName());
            System.out.println("");
            
           System.out.println("No third pet in system");
           System.out.println("");
           
           System.out.println("");
           System.out.println("Name:");
           System.out.println(fourthPet.getName());
           System.out.println("Type:");
           System.out.println(fourthPet.getType());
           System.out.println("Size:");
           System.out.println(fourthPet.getSize());
           System.out.println("Weight:");
           System.out.println(fourthPet.getWeight());
           System.out.println("Age:");
           System.out.println(fourthPet.getAge());
           System.out.println("Doctor:");
           System.out.println(fourthPet.getDoctorName());
           System.out.println("");
           
           System.out.println("");
           System.out.println("Please enter another command:");
           
  //Tests if there is a pet in forthPetName         
		} else if (_fourthPetName1 == "") {
			System.out.println("");
            System.out.println("Name:");
            System.out.println(firstPet.getName());
            System.out.println("Type:");
            System.out.println(firstPet.getType());
            System.out.println("Size:");
            System.out.println(firstPet.getSize());
            System.out.println("Weight:");
            System.out.println(firstPet.getWeight());
            System.out.println("Age:");
            System.out.println(firstPet.getAge());
            System.out.println("Doctor:");
            System.out.println(firstPet.getDoctorName());
            System.out.println("");
            
            System.out.println("");
            System.out.println("Name:");
            System.out.println(secondPet.getName());
            System.out.println("Type:");
            System.out.println(secondPet.getType());
            System.out.println("Size:");
            System.out.println(secondPet.getSize());
            System.out.println("Weight:");
            System.out.println(secondPet.getWeight());
            System.out.println("Age:");
            System.out.println(secondPet.getAge());
            System.out.println("Doctor:");
            System.out.println(secondPet.getDoctorName());
            System.out.println("");
            
            System.out.println("");
            System.out.println("Name:");
            System.out.println(thirdPet.getName());
            System.out.println("Type:");
            System.out.println(thirdPet.getType());
            System.out.println("Size:");
            System.out.println(thirdPet.getSize());
            System.out.println("Weight:");
            System.out.println(thirdPet.getWeight());
            System.out.println("Age:");
            System.out.println(thirdPet.getAge());
            System.out.println("Doctor:");
            System.out.println(thirdPet.getDoctorName());
            System.out.println("");
            
            System.out.println("");
            System.out.println("No fourth pet in system");
            System.out.println("");
            
		} else if (_firstPetName1 != "" && _secondPetName1 != "" && _thirdPetName1 != "" && _fourthPetName1 != "") {
			
			System.out.println("");
            System.out.println("Name:");
            System.out.println(firstPet.getName());
            System.out.println("Type:");
            System.out.println(firstPet.getType());
            System.out.println("Size:");
            System.out.println(firstPet.getSize());
            System.out.println("Weight:");
            System.out.println(firstPet.getWeight());
            System.out.println("Age:");
            System.out.println(firstPet.getAge());
            System.out.println("Doctor:");
            System.out.println(firstPet.getDoctorName());
            System.out.println("");
            
            System.out.println("");
            System.out.println("Name:");
            System.out.println(secondPet.getName());
            System.out.println("Type:");
            System.out.println(secondPet.getType());
            System.out.println("Size:");
            System.out.println(secondPet.getSize());
            System.out.println("Weight:");
            System.out.println(secondPet.getWeight());
            System.out.println("Age:");
            System.out.println(secondPet.getAge());
            System.out.println("Doctor:");
            System.out.println(secondPet.getDoctorName());
            System.out.println("");
            
            System.out.println("");
            System.out.println("Name:");
            System.out.println(thirdPet.getName());
            System.out.println("Type:");
            System.out.println(thirdPet.getType());
            System.out.println("Size:");
            System.out.println(thirdPet.getSize());
            System.out.println("Weight:");
            System.out.println(thirdPet.getWeight());
            System.out.println("Age:");
            System.out.println(thirdPet.getAge());
            System.out.println("Doctor:");
            System.out.println(thirdPet.getDoctorName());
            System.out.println("");
            
            System.out.println("");
            System.out.println("Name:");
            System.out.println(fourthPet.getName());
            System.out.println("Type:");
            System.out.println(fourthPet.getType());
            System.out.println("Size:");
            System.out.println(fourthPet.getSize());
            System.out.println("Weight:");
            System.out.println(fourthPet.getWeight());
            System.out.println("Age:");
            System.out.println(fourthPet.getAge());
            System.out.println("Doctor:");
            System.out.println(fourthPet.getDoctorName());
            System.out.println("");
            
            System.out.println("");
            System.out.println("Please enter another command:");
		}  
		}
	}
	
	
	 private void removeDoctor() {
         System.out.println("Enter name of doctor: ");
         String doctorName = command.nextLine();
         
         String firstDoctorName = firstDoctor.getName();
         String secondDoctorName = secondDoctor.getName();
         
         if (firstDoctorName.equalsIgnoreCase(doctorName)) {
             firstDoctor.setName("");
             firstDoctor.setSpec("");
             System.out.println("Done!");
         } else if (secondDoctorName.equalsIgnoreCase(doctorName)) {
             secondDoctor.setName("");
             secondDoctor.setSpec("");
             System.out.println("Done!");
         } else {
             System.out.println("No doctor with that name(please check case)!");
         }
  
     }
	
	private void removePet() {
    	System.out.println("Enter name of pet: ");
        String petName = command.nextLine();
        
        String firstPetName = firstPet.getName();
        String secondPetName = secondPet.getName();
        String thirdPetName = thirdPet.getName();
        String fourthPetName = fourthPet.getName();
        
        if (firstPetName.equalsIgnoreCase(petName)) {
            firstPet.setName("");
            firstPet.setWeight(-1);
            firstPet.setAge(-1);
            firstPet.setSize(null);
            firstPet.setDoctorName("");
            System.out.println("Done!");
        } else if (secondPetName.equalsIgnoreCase(petName)) {
            secondPet.setName("");
            secondPet.setWeight(-1);
            secondPet.setAge(-1);
            secondPet.setSize(null);
            secondPet.setDoctorName("");
            System.out.println("Done!");
        } else if (thirdPetName.equalsIgnoreCase(petName)) {
            thirdPet.setName("");
            thirdPet.setWeight(-1);
            thirdPet.setAge(-1);
            thirdPet.setSize(null);
            thirdPet.setDoctorName("");
            System.out.println("Done!");
        } else if (fourthPetName.equalsIgnoreCase(petName)) {
            fourthPet.setName("");
            fourthPet.setWeight(-1);
            fourthPet.setAge(-1);
            fourthPet.setSize(null);
            fourthPet.setDoctorName("");
            System.out.println("Done!");
        } else {
            System.out.println("No pet with that name(please check case)!");
        }
        
	System.out.println("");
        System.out.println("Please enter another command:");
    }
	
	private void analysePet() {
		System.out.println("Enter name of pet to analyse:");
    	command.nextLine();
    	String petName = command.nextLine();
    	
    	
    	
    	if (firstPet.getName().equals(petName)) {
    		if (firstPet.getType().equals("cat")) {
    			if (firstPet.getSize().equals("small") && firstPet.getWeight() > 4) {
    				System.out.println("Pet " + firstPet.getName() + " is overweight.");
    			} else if (firstPet.getSize().equals("medium") && firstPet.getWeight() > 6) {
    				System.out.println("Pet " + firstPet.getName() + " is overweight.");
    			} else if (firstPet.getSize().equals("large") && firstPet.getWeight() > 8) {
    				System.out.println("Pet " + firstPet.getName() + " is overweight.");
    				
    			} 
    		}
    			
    		} else if (firstPet.getType().equals("dog")) {
    			if (firstPet.getSize().equals("small") && firstPet.getWeight() > 6) {
					System.out.println("Pet " + firstPet.getName() + " is overweight.");
				} else if (firstPet.getSize().equals("medium") && firstPet.getWeight() > 9) {
    				System.out.println("Pet " + firstPet.getName() + " is overweight.");
    			} else if (firstPet.getSize().equals("large") && firstPet.getWeight() > 12) {
    				System.out.println("Pet " + firstPet.getName() + " is overweight.");
    			}
    		}
    	 
    		else if (secondPet.getName().equals(petName)) {
    	if (secondPet.getType().equals("cat")) {
    			if (secondPet.getSize().equals("small") && secondPet.getWeight() > 4) {
    				System.out.println("Pet " + secondPet.getName() + " is overweight.");
    				} else if (secondPet.getSize().equals("medium") && secondPet.getWeight() > 6) {
    				System.out.println("Pet " + secondPet.getName() + " is overweight.");
    				} else if (secondPet.getSize().equals("large") && secondPet.getWeight() > 8) {
    				System.out.println("Pet " + secondPet.getName() + " is overweight.");
    				}
    	} else if (secondPet.getType().equals("dog")) {
			if (secondPet.getSize().equals("small") && secondPet.getWeight() > 6) {
				System.out.println("Pet " + secondPet.getName() + " is overweight.");
				} else if (secondPet.getSize().equals("medium") && secondPet.getWeight() > 9) {
				System.out.println("Pet " + secondPet.getName() + " is overweight.");
				} else if (secondPet.getSize().equals("large") && secondPet.getWeight() > 12) {
				System.out.println("Pet " + secondPet.getName() + " is overweight.");
			}
		}
    }
    

    	
    	else if (thirdPet.getName().equals(petName)) {
    		if (thirdPet.getType().equals("cat")) {
    			if (thirdPet.getSize().equals("small") && thirdPet.getWeight() > 4) {
    				System.out.println("Pet " + thirdPet.getName() + " is overweight.");
    			} else if (thirdPet.getSize().equals("medium") && thirdPet.getWeight() > 6) {
    				System.out.println("Pet " + thirdPet.getName() + " is overweight.");
    			} else if (thirdPet.getSize().equals("large") && thirdPet.getWeight() > 8) {
    				System.out.println("Pet " + thirdPet.getName() + " is overweight.");
    				
    			} 
    		}
    			
    		} else if (thirdPet.getType().equals("dog")) {
    			if (thirdPet.getSize().equals("small") && thirdPet.getWeight() > 6) {
					System.out.println("Pet " + thirdPet.getName() + " is overweight.");
				} else if (thirdPet.getSize().equals("medium") && thirdPet.getWeight() > 9) {
    				System.out.println("Pet " + thirdPet.getName() + " is overweight.");
    			} else if (thirdPet.getSize().equals("large") && thirdPet.getWeight() > 12) {
    				System.out.println("Pet " + thirdPet.getName() + " is overweight.");
    			}
    		}
    	 
    		else if (fourthPet.getName().equals(petName)) {
    	if (fourthPet.getType().equals("cat")) {
    			if (fourthPet.getSize().equals("small") && fourthPet.getWeight() > 4) {
    				System.out.println("Pet " + fourthPet.getName() + " is overweight.");
    				} else if (fourthPet.getSize().equals("medium") && fourthPet.getWeight() > 6) {
    				System.out.println("Pet " + fourthPet.getName() + " is overweight.");
    				} else if (fourthPet.getSize().equals("large") && fourthPet.getWeight() > 8) {
    				System.out.println("Pet " + fourthPet.getName() + " is overweight.");
    				}
    	} else if (fourthPet.getType().equals("dog")) {
			if (fourthPet.getSize().equals("small") && fourthPet.getWeight() > 6) {
				System.out.println("Pet " + fourthPet.getName() + " is overweight.");
	
				} else if (fourthPet.getSize().equals("medium") && fourthPet.getWeight() > 9) {
				System.out.println("Pet " + fourthPet.getName() + " is overweight.");
			
				} else if (fourthPet.getSize().equals("large") && fourthPet.getWeight() > 12) {
				System.out.println("Pet " + fourthPet.getName() + " is overweight.");
			
			}
			
		}
    	
    }
    	
	}

        private void addDoctor() {
            System.out.println("Enter name of doctor: ");
            
//input for adding name of doctor            
        	String doctorName = command.nextLine(); 
        	System.out.println("");
        	
//input of 1, or 2 for animal specialisation        	
        	System.out.println("Enter specialisation: 1 for dog, 2 for cat "); 
        	
//initializes variable doctorSpec based off input        	
        	int doctorSpec = command.nextInt();
        	
//Initializes variable for firstDoctorName
            String firstDoctorName = firstDoctor.getName(); 
            String secondDoctorName = secondDoctor.getName();

//IF statement for assigning 1 and 2 to specialisation                
                if (firstDoctorName == "") {
                    firstDoctor.setName(doctorName);
            switch (doctorSpec) {
                case 1:
                    firstDoctor.setSpec("dog");
                    break;
                case 2:
                    firstDoctor.setSpec("cat");
                    break;
                default:
                    System.out.println("Error! Enter either 1 or 2");
                    break;
            }
                

//IF statement for assigning 1 and 2 to specialisation                
                
                } else if (secondDoctorName == "") {
                    secondDoctor.setName(doctorName);
                    switch (doctorSpec) {
                case 1:
                    secondDoctor.setSpec("");
                    break;
                case 2:
                    secondDoctor.setSpec("cat");
                    break;
                default:
                    System.out.println("Error! Enter either 1 or 2");
                    break;
            }
                
                } else {
                    System.out.println("Too many doctors!");
                } 
                System.out.println("");
        }

	public static void main(String[] args)
	{
    		Clinic clinic = new Clinic();
    		clinic.run();
	}
}
