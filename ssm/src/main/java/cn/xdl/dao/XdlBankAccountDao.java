package cn.xdl.dao;

import org.apache.ibatis.annotations.Param;

import cn.xdl.bean.XdlBankAccount;

public interface XdlBankAccountDao {

	XdlBankAccount findByAccnoAndAccpassword(@Param("acc_no")String acc_no,
			@Param("acc_password")String acc_password);
}
