package com.sam.webtasks.client;

public class Names {
	//reminder conditions
	public final static int REMINDERS_NOTALLOWED=0; //can't use reminders
	public final static int REMINDERS_OPTIONAL=1;   //optional to use reminders
	public final static int REMINDERS_MANDATORY_ANYCIRCLE=2; //mandatory to set reminders, but it works to move any circles, not just the specified targets
	public final static int REMINDERS_MANDATORY_TARGETONLY=3;//mandatory to set reminders for the specified targets
	public final static int REMINDERS_VARIABLE=4;  //can set reminders for circles associated with some target direction but not others
		
	//Gender
	public final static int GENDER_MALE=0;
	public final static int GENDER_FEMALE=1;
	public final static int GENDER_OTHER=2;
	
	//policy for dealing with participants who have already accessed the task
	//who can take part?
	public final static int ELIGIBILITY_ANYONE=0; //anyone can take part
	public final static int ELIGIBILITY_NEVERCOMPLETED=1; //can only take part if you haven't completed the experiment
	public final static int ELIGIBILITY_NEVERACCESSED=2;  //can only take part if you haven't accessed the task
	
	//feedback valence
	public final static int FEEDBACK_POSITIVE=0;
	public final static int FEEDBACK_NEGATIVE=1;
	
	//initial practice difficulty
	public final static int PRACTICE_EASY=0;
	public final static int PRACTICE_DIFFICULT=1;
	
	//what stimuli are inside the circles?
	public final static int ONGOING_STIM_NUMBERS=0;
	public final static int ONGOING_STIM_LETTERS=1;
	public final static int ONGOING_STIM_NUMBERS_DESCENDING=3;
	
	//what experiment type is this?
	public final static int EXPERIMENT_MTURK=0;      //experiment to be run on the MTurk platform
	public final static int EXPERIMENT_STANDALONE=1; //experiment to be run without uploading to MTurk, e.g. on a tablet computer or on a desktop
}

