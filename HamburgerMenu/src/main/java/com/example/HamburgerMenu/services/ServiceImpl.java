package com.example.HamburgerMenu.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.HamburgerMenu.entity.AboutUsDatum;
import com.example.HamburgerMenu.entity.Bank;
import com.example.HamburgerMenu.entity.CustomerSupportDatum;
import com.example.HamburgerMenu.entity.Datum;
import com.example.HamburgerMenu.entity.InstantLoansDatum;
import com.example.HamburgerMenu.entity.InsuranceSolutionsDatum;
import com.example.HamburgerMenu.entity.ManageAppLockDatum;
import com.example.HamburgerMenu.entity.MoneyMakerDatum;
import com.example.HamburgerMenu.entity.MoneySaverDatum;
import com.example.HamburgerMenu.entity.Root;
import com.example.HamburgerMenu.entity.SettingsDatum;
import com.example.HamburgerMenu.entity.Submenu;
import com.example.HamburgerMenu.entity.WealthDatum;

@Service
public class ServiceImpl implements ServiceInterface{
    Root root =new Root();
	@Override
	public Root getData() {
		// TODO Auto-generated method stub
		return root;
	}
	List<AboutUsDatum> list;
	List<Bank> list1;
	List<CustomerSupportDatum> list2;
	List<Datum> list3;
	List<InstantLoansDatum> list4;
	List<InsuranceSolutionsDatum> list5;
	List<ManageAppLockDatum> list6;
	List<MoneyMakerDatum> list7;
	List<MoneySaverDatum> list8;
	List<SettingsDatum> list9;
	List<Submenu> list10;
	List<WealthDatum> list11;
	List<Submenu> list12;
	
	public ServiceImpl() {
		list =new ArrayList<AboutUsDatum>();
		list1 =new ArrayList<Bank>();
		list2 =new ArrayList<CustomerSupportDatum>();
		list3 =new ArrayList<Datum>(); 
		list4 =new ArrayList<InstantLoansDatum>(); 
		list5 =new ArrayList<InsuranceSolutionsDatum>();
		list6 =new ArrayList<ManageAppLockDatum>();
		list7 =new ArrayList<MoneyMakerDatum>();
		list8 =new ArrayList<MoneySaverDatum>();
		list9 =new ArrayList<SettingsDatum>();
		list10 =new ArrayList<Submenu>();
		list11 =new ArrayList<WealthDatum>();
		list12 =new ArrayList<Submenu>();
		
		root =new Root(list3,list11,list7,list8,list1, list5, list4, list2, list9, list, list6);
		list.add(0, new AboutUsDatum("assets/icon/disclaimer.svg", "Disclaimers"));
		list.add(1, new AboutUsDatum("assets/icon/privacyPolicyIcon.svg", "Privacy Policy"));
		list.add(2, new AboutUsDatum("assets/icon/terms&conditionIcon.svg", "Terms & Conditions"));
		list1.add(0, new Bank("assets/icon/Insurance.svg", "Insurance Solutions", "KYC-Pending","Get your KYC done today and start investing"));
		list1.add(1, new Bank("assets/icon/instant-loan.svg", "Instant Loans", null, "Get your KYC done today and start investing"));
		list2.add(0, new CustomerSupportDatum("assets/icon/MyIssues.svg", "My Issues"));
		list2.add(1, new CustomerSupportDatum("assets/icon/FAQs.svg", "FAQs"));
		list2.add(2, new CustomerSupportDatum("assets/icon/chatIcon.svg", "Chat with Us"));
		list2.add(3, new CustomerSupportDatum("assets/icon/contactUs.svg", "Contact Us"));
		list3.add(0, new Datum("assets/icon/wealthIconforMenu.svg", "Wealth","KYC-Completed"));
		list3.add(1, new Datum("assets/icon/healthiconforMenu.svg", "Health", null));
		list3.add(2, new Datum("assets/icon/education.svg", "Education", null));
		list3.add(3, new Datum("assets/icon/bank.svg", "Bank", "KYC-Pending"));
		list3.add(4, new Datum("assets/icon/agent.svg", "Customer Support", null));
		list3.add(5, new Datum("assets/icon/Refer&earn.svg", "Refer and Earn", null));
		list3.add(5, new Datum("assets/icon/settings.svg", "Settings", null));
		list10.add(0,new Submenu("assets/icon/carInsurance.svg", "Car Insurance","Get your KYC done today and start investing"));
		list10.add(1,new Submenu("assets/icon/twoWheelerInsurance.svg",  "Two Wheeler Insurance", "Get your KYC done today and start investing"));
		list4.add(0, new InstantLoansDatum("assets/icon/personalLoan.svg", "Personal Loan", "Get your KYC done today and start investing", null));
		list4.add(1, new InstantLoansDatum("assets/icon/homeLoans.svg", "Home Loan", "Get your KYC done today and start investing", null));
		list4.add(2, new InstantLoansDatum("assets/icon/vehicleLoans.svg", "Vehicle Loan", "Get your KYC done today and start investing", null));
		list4.add(3, new InstantLoansDatum("assets/icon/gold.svg", "Gold Loan", "Get your KYC done today and start investing", null));
		list4.add(4, new InstantLoansDatum("assets/icon/businessLoans.svg", "Business Loan", "Get your KYC done today and start investing", null));
		list4.add(5, new InstantLoansDatum("assets/icon/educationLoan.svg", "Education Loan", "Get your KYC done today and start investing", null));
		list4.add(6, new InstantLoansDatum("assets/icon/las.svg", "LAS", "Get your KYC done today and start investing", null));
		list5.add(0, new InsuranceSolutionsDatum("assets/icon/healthInsurance.svg", "Health Insurance", "KYC-Completed", "Get your KYC done today and start investing", null));
		list5.add(1, new InsuranceSolutionsDatum("assets/icon/term-insurance.svg", "Term Insurance","KYC-Completed", "Get your KYC done today and start investing", list10));
		list5.add(2, new InsuranceSolutionsDatum("assets/icon/childInsurance.svg", "Child Insurance", "KYC-Completed", "Get your KYC done today and start investing",null));
		list5.add(3, new InsuranceSolutionsDatum("assets/icon/pensionPlan.svg", "Pension Plans", "KYC-Completed","Get your KYC done today and start investing", null));
		list5.add(4, new InsuranceSolutionsDatum("assets/icon/vehicleInsurance.svg", "Vehicle Insurance", "KYC-Completed","Get your KYC done today and start investing",null));
		list5.add(5, new InsuranceSolutionsDatum("assets/icon/travelInsurance.svg", "Travel Insurance", null,"Get your KYC done today and start investing",null));
		list6.add(0, new ManageAppLockDatum("assets/icon/Refer&earn.svg", "Refer and Earn", true));
		list6.add(1, new ManageAppLockDatum("assets/icon/fingerPrintIcon.svg", "Fingerprint", true));
		list6.add(2, new ManageAppLockDatum("assets/icon/passcodeIcon.svg", "Passcode", true));
		list6.add(3, new ManageAppLockDatum("assets/icon/mpinIcon.svg", "MPIN", true));
		list7.add(0, new MoneyMakerDatum("assets/icon/mutual-fund.svg", "Mutual Funds", "KYC-Completed", "Your account is verified by Aqube. Start Investing", null, true));
		list12.add(0, new Submenu("assets/icon/stocks.svg", "Stocks", "Get your KYC done today and start investing"));
		list12.add(1, new Submenu("assets/icon/etf.svg",  "ETFs", "Get your KYC done today and start investing"));
		list12.add(2, new Submenu("assets/icon/ipo.svg", "IPOs", "Get your KYC done today and start investing"));
		list12.add(3, new Submenu("assets/icon/us-stock.svg", "US Stocks", "Get your KYC done today and start investing"));
		list12.add(4, new Submenu("assets/icon/basket.svg",  "Basket", "Get your KYC done today and start investing"));
		list7.add(1, new MoneyMakerDatum("assets/icon/mutual-fund.svg", "Mutual Funds", "KYC-Completed", "Your account is verified by Aqube. Start Investing", list12, true));
		list8.add(0, new MoneySaverDatum("assets/icon/gold.svg", "Gold",null,"Your account is verified by Aqube. Start Investing", true));
		list8.add(1, new MoneySaverDatum("assets/icon/fixed-deposit.svg", "Fixed Deposits",null, "Your account is verified by Aqube. Start Investing", true));
		list8.add(2, new MoneySaverDatum("assets/icon/bonds.svg", "Bonds","KYC-Pending", "Get your KYC done today and start investing", true));
		list9.add(0, new SettingsDatum("assets/icon/manageLock.svg",  "Manage App Lock", true));
		list9.add(1, new SettingsDatum("assets/icon/siriShortCut.svg",  "Siri Shortcuts", true));
		list9.add(2, new SettingsDatum("assets/icon/aboutusIcon.svg",  "About Us", true));
		list9.add(3, new SettingsDatum("assets/icon/RateUsIcon.svg",  "Rate Us", true));
		list11.add(0, new WealthDatum("assets/icon/money-maker.svg",  "Money Maker", "KYC-Completed", "Your account is verified by Torus. Start Investing", true));
		list11.add(1, new WealthDatum("assets/icon/money-saver.svg",  "Money Saver", "KYC-Completed","Get your KYC done today and start investing", true));
		
		
	}	
}
