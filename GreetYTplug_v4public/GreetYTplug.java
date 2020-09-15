/**
GreetYTplug is a plugin to just simply add hi to any object.
Copyright (C) 2020 AF6A5EDC0FC3B04CF4FB660778CE3142B709DE1BC6F5AFF46AA69CA1EA5F7E7E

This program is free software; you can redistribute it and/or
modify it under the terms of the REALISTIC FAIR GENERAL PUBLIC PRIVACY
VERSION 1 LICENSE.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
REALISTIC FAIR GENERAL PUBLIC PRIVACY for more details.

You should have received a copy of REALISTIC FAIR GENERAL PUBLIC PRIVACY LICENSE
*/
public class GreetYTplug{

	public String plugstart(String[] args) {
    org.apache.commons.cli.DefaultParser dftparser=new org.apache.commons.cli.DefaultParser();
	org.apache.commons.cli.Options cmdoptions=new org.apache.commons.cli.Options();
	cmdoptions.addRequiredOption("i","indir",true,"an argument which is input string to");
	try{org.apache.commons.cli.CommandLine outcmdline=dftparser.parse(cmdoptions,args);
	String parsedoptionone=outcmdline.getOptionValue("i","");
	return "hi "+parsedoptionone;
	}catch(Exception e){System.out.println("what can go wrong?");return "";}
	}
	
}