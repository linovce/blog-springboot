package com.linovce.blog.entity;

/**   
 * @Function: com.linovce.blog.entity.RolePermission::
 * @Description: 该函数的功能描述
 * @version: v1.0.0
 * @author: linry_t   
 * @date: 2021/3/26 15:44
 * 
 * Modification History:
 * Date         Author          Version            Description
 *-------------------------------------------------------------
 * 2021/3/26      linry_t           v1.0.0               修改原因
 */

public class RolePermission{
	
	private Long id;
	private Long pid;
	private Long rid;
	
	public void setId(Long id){
		this.id = id;
	}
	
	public Long getId(){
		return this.id;
	}
	public void setPid(Long pid){
		this.pid = pid;
	}
	
	public Long getPid(){
		return this.pid;
	}
	public void setRid(Long rid){
		this.rid = rid;
	}
	
	public Long getRid(){
		return this.rid;
	}

	@Override
	public String toString() {
		return "RolePermission{" +
				"id=" + id +
				", pid=" + pid +
				", rid=" + rid +
				'}';
	}
}