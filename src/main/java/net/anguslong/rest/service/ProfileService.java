package net.anguslong.rest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import net.anguslong.rest.database.DatabaseClass;
import net.anguslong.rest.model.Message;
import net.anguslong.rest.model.Profile;

public class ProfileService {
	private Map<String, Profile> profiles = DatabaseClass.getProfiles();

	public ProfileService () {
		profiles.put("gus", new Profile(1L, "gus", "Angus", "Long"));
	}
	
	public List<Profile> getAllProfiles() {
		return new ArrayList<Profile>(profiles.values());
	}

	public Profile getProfile(String name) {
		return profiles.get(name);
	}

	public Profile addProfile(Profile profile) {
		profile.setId(profiles.size() + 1);
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}

	public Profile updateProfile(Profile profile) {
		if (profile.getId() <= 0) {
			return null;
		}
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}

	public Profile removeProfile(String name) {
		return profiles.remove(name);
	}
}
