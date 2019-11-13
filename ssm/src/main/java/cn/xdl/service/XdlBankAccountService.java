package cn.xdl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.xdl.bean.XdlBankAccount;
import cn.xdl.dao.XdlBankAccountDao;

@Service("bankService")
public class XdlBankAccountService {

	@Autowired
	private  XdlBankAccountDao accountDao ;
	
	public XdlBankAccount accnologin(String acc_no,String acc_password) {
		return accountDao.findByAccnoAndAccpassword(acc_no, acc_password);
	}
}
