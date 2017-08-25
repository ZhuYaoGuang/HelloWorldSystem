package cn.edu.hpu.stumag.register;

import java.util.List;

public interface UserManager {
     
    public boolean add(User user);
		
    public List<User> getUsers();
    
	public User getUserById(String id);
}
