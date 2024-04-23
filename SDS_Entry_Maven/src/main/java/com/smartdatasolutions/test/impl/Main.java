package com.smartdatasolutions.test.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.smartdatasolutions.test.Member;
import com.smartdatasolutions.test.MemberExporter;
import com.smartdatasolutions.test.MemberFileConverter;
import com.smartdatasolutions.test.MemberImporter;

public class Main extends MemberFileConverter {

	@Override
	protected MemberExporter getMemberExporter( ) {
		
		return new MemberExporterImpl();
	}

	@Override
	protected MemberImporter getMemberImporter( ) {
	
		 return new MemberImporterImpl();
	}

	@Override
	protected List< Member > getNonDuplicateMembers( List< Member > membersFile ) {

		List<Member> listWithoutDuplicateMembers = new ArrayList<>();
		Map<String, Boolean> mapOfMember = new HashMap<>();
		for (Member member : membersFile) {
			String memberId = member.getId();
			if (!mapOfMember.containsKey(memberId) || !mapOfMember.get(memberId)) {
				listWithoutDuplicateMembers.add(member);
				mapOfMember.put(memberId, true);
			}
		}
		return listWithoutDuplicateMembers;
	}

	@Override
	protected Map<String,List<Member>> splitMembersByState(List<Member> validMembers){
		
		Map<String, List<Member>> map = new HashMap<>();
		for (Member member : validMembers) {
			String state = member.getState();
			if (!map.containsKey(state)) {
				map.put(state, new ArrayList<>());
			}
			map.get(state).add(member);
		}
		return map;
	}

	public static void main( String[] args ) {

		 try {
	            Main main = new Main();
	            
	            File inputFileMember = new File(".\\Members.txt");

	            String outputFilePath = "OutPut_File"; 

	            String outputFileName = "outputFile.csv"; 

	            main.convert(inputFileMember, outputFilePath, outputFileName);

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}

}
