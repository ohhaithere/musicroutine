package com.frosty.musicroutine.dao;

import com.frosty.musicroutine.domain.UserSession;

public interface UserSessionDao {
	
	public void addSession(UserSession session);
	
	public Boolean checkSession(String token);
	

}
