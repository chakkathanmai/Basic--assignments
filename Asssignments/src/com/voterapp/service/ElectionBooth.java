package com.voterapp.service;

import com.voterapp.exception.*;

public class ElectionBooth {
      String localities[]= {"ABC Nagar","XYZ Nagar","RK Nagar"};
	
	
	// throws exception if age is less than 18
	boolean checkAge(int age) throws UnderAgeException {
		try {
			if (age >= 18) {
				return true;
			} else {
				throw new UnderAgeException("Eligible age is 18 and above - Not Eligible");
			}
		} catch (UnderAgeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		return false;
	}

	// throws exception if locality don't match with in array
	boolean checkLocallity(String locality) throws LocalityNotFoundException {
		try {
			for (String location : localities) {
				if (location.equals(locality)) {
					return true;
				} else  {
					throw new LocalityNotFoundException("Location Not Correct - Try Again");
				}
			}
		} catch (LocalityNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		return false;

	}

	// throws exception if id is not within 1000-9000
	boolean checkvoterId(int vid) throws NoVoterIDException {
		try {
			if (vid >=1000 && vid <= 9000) {
				return true;
			}
			else {
				throw new NoVoterIDException("Voter Id is Not Correct -VoterId will be between 1000-9000");
			}
		} catch (NoVoterIDException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		return false;	}

	public void checkEligibility(int age, String locality, int vid)
			throws NotEligibleException {
		

		if(checkAge(age)&&
		checkLocallity(locality)&&
		checkvoterId(vid)) {
			System.out.println("Succesfull Validation, Your Eligible to Vote");
		}
		else {
			throw new NotEligibleException("NotSuccesfull Validation, Try Again");
		}
	}

}
