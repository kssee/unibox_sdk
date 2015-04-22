package com.unipin.android.demo;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.unipin.android.unibox.CUniBoxWidget;
import com.unipin.android.unibox.IUniBoxWidget;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends Activity implements IUniBoxWidget
{
	private final String cm_guid = "324D8BF4-F149-720C-1A4D-60815EEEAE6F";
	private final String cm_secretKey = "B8st9opV5aud2YAv";

	//private final String cm_guid = "3A969A17-ECA4-758A-F151-8F60DEE49085";
	//private final String cm_secretKey = "oEDwI6tXmPjzFinA";

	private Fragment m_pFrag = null;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		m_pFrag = null;
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.menu_main, menu);
		return true;
	}


	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		//int id = item.getItemId();

		//noinspection SimplifiableIfStatement
		//if (id == R.id.action_settings)
		//{
		//	return true;
		//}

		return super.onOptionsItemSelected(item);
	}

	public void onBtnUniPinClick(View view)
	{
		CUniBoxWidget pUniBox = CUniBoxWidget.getInstance(cm_guid, cm_secretKey, this);
		pUniBox.setReference("1");
		pUniBox.setMessage("Hello World");
		pUniBox.setUrlAck("http://www.unipay.co.id/404.html");
		pUniBox.setUrlReturn("http://www.unipin.co.id");

		//pUniBox.setChannel("UPOINT");

		pUniBox.vAddDenomination("10000", "10,000 Chips");
		pUniBox.vAddDenomination("20000", "20,000 Chips");
		pUniBox.vAddDenomination("50000", "50,000 Chips");
		pUniBox.vAddDenomination("100000", "100,000 Chips");
		pUniBox.vAddDenomination("300000", "300,000 Chips");
		pUniBox.vAddDenomination("500000", "500,000 Chips");

		FragmentTransaction pTrans = getFragmentManager().beginTransaction();
		if (m_pFrag != null)
			pTrans.remove(m_pFrag);

		m_pFrag = pUniBox;
		pTrans.add(R.id.frmUniPin, m_pFrag);
		pTrans.commit();
	}

	public void onBtnIndosatClient(View view)
	{
		CUniBoxWidget pUniBox = CUniBoxWidget.getInstance(cm_guid, cm_secretKey, this);
		pUniBox.setReference("1");
		pUniBox.setMessage("Hello World");
		pUniBox.setUrlAck("http://www.unipay.co.id/404.html");
		pUniBox.setUrlReturn("http://www.unipin.co.id");

		pUniBox.setChannel("INDOSAT");

		pUniBox.vAddDenomination("5500", "5,500 Chips");
		pUniBox.vAddDenomination("16500", "16,500 Chips");
		pUniBox.vAddDenomination("49500", "49,500 Chips");
		pUniBox.vAddDenomination("82500", "82,500 Chips");
		pUniBox.vAddDenomination("110000", "110,000 Chips");

		FragmentTransaction pTrans = getFragmentManager().beginTransaction();
		if (m_pFrag != null)
			pTrans.remove(m_pFrag);

		m_pFrag = pUniBox;
		pTrans.add(R.id.frmUniPin, m_pFrag);
		pTrans.commit();
	}

	public void onBtnXLClick(View view)
	{
		CUniBoxWidget pUniBox = CUniBoxWidget.getInstance(cm_guid, cm_secretKey, this);
		pUniBox.setReference("1");
		pUniBox.setMessage("Hello World");
		pUniBox.setUrlAck("http://www.unipay.co.id/404.html");
		pUniBox.setUrlReturn("http://www.unipin.co.id");

		pUniBox.setChannel("XL");

		pUniBox.vAddDenomination("5500", "5,500 Chips");
		pUniBox.vAddDenomination("16500", "16,500 Chips");
		pUniBox.vAddDenomination("49500", "49,500 Chips");
		pUniBox.vAddDenomination("82500", "82,500 Chips");
		pUniBox.vAddDenomination("110000", "110,000 Chips");

		FragmentTransaction pTrans = getFragmentManager().beginTransaction();
		if (m_pFrag != null)
			pTrans.remove(m_pFrag);

		m_pFrag = pUniBox;
		pTrans.add(R.id.frmUniPin, m_pFrag);
		pTrans.commit();
	}

	public void onBtnXlVoucherClick(View view)
	{
		CUniBoxWidget pUniBox = CUniBoxWidget.getInstance(cm_guid, cm_secretKey, this);
		pUniBox.setReference("1");
		pUniBox.setMessage("Hello World");
		pUniBox.setUrlAck("http://www.unipay.co.id/404.html");
		pUniBox.setUrlReturn("http://www.unipin.co.id");

		pUniBox.setChannel("XLVOUCHER");

		pUniBox.vAddDenomination("10000", "10,000 Chips");
		pUniBox.vAddDenomination("25000", "25,000 Chips");
		pUniBox.vAddDenomination("50000", "50,000 Chips");

		FragmentTransaction pTrans = getFragmentManager().beginTransaction();
		if (m_pFrag != null)
			pTrans.remove(m_pFrag);

		m_pFrag = pUniBox;
		pTrans.add(R.id.frmUniPin, m_pFrag);
		pTrans.commit();
	}

	public void onBtnUPointClick(View view)
	{
		CUniBoxWidget pUniBox = CUniBoxWidget.getInstance(cm_guid, cm_secretKey, this);
		pUniBox.setReference("1");
		pUniBox.setMessage("Hello World");
		pUniBox.setUrlAck("http://www.unipay.co.id/404.html");
		pUniBox.setUrlReturn("http://www.unipin.co.id");

		pUniBox.setChannel("UPOINT");

		pUniBox.vAddDenomination("5000", "5,000 Chips");
		pUniBox.vAddDenomination("10000", "10,000 Chips");
		pUniBox.vAddDenomination("25000", "25,000 Chips");
		pUniBox.vAddDenomination("50000", "50,000 Chips");
		pUniBox.vAddDenomination("100000", "100,000 Chips");

		FragmentTransaction pTrans = getFragmentManager().beginTransaction();
		if (m_pFrag != null)
			pTrans.remove(m_pFrag);

		m_pFrag = pUniBox;
		pTrans.add(R.id.frmUniPin, m_pFrag);
		pTrans.commit();
	}

	public void onBtnUPointVoucherClick(View view)
	{
		CUniBoxWidget pUniBox = CUniBoxWidget.getInstance(cm_guid, cm_secretKey, this);
		pUniBox.setReference("1");
		pUniBox.setMessage("Hello World");
		pUniBox.setUrlAck("http://www.unipay.co.id/404.html");
		pUniBox.setUrlReturn("http://www.unipin.co.id");

		pUniBox.setChannel("UPVOUCHER");

		pUniBox.vAddDenomination("10000", "10,000 Chips");
		pUniBox.vAddDenomination("25000", "25,000 Chips");
		pUniBox.vAddDenomination("50000", "50,000 Chips");
		pUniBox.vAddDenomination("100000", "100,000 Chips");

		FragmentTransaction pTrans = getFragmentManager().beginTransaction();
		if (m_pFrag != null)
			pTrans.remove(m_pFrag);

		m_pFrag = pUniBox;
		pTrans.add(R.id.frmUniPin, m_pFrag);
		pTrans.commit();
	}

	@Override
	public void delUniBoxWidget(JSONObject _jsn)
	{
		Log.d("MainActivity", _jsn.toString());

		StringBuilder sb = new StringBuilder();
		try
		{
			sb.append("status : ");
			sb.append(_jsn.get("status"));
			sb.append("\n");

			sb.append("type : ");
			sb.append(_jsn.get("type"));
			sb.append("\n");

			sb.append("amount : ");
			sb.append(_jsn.get("amount"));
			sb.append("\n");

			sb.append("trxNo : ");
			sb.append(_jsn.get("trxNo"));
			sb.append("\n");

			sb.append("reference : ");
			sb.append(_jsn.get("reference"));
			sb.append("\n");

			sb.append("message : ");
			sb.append(_jsn.get("message"));
			sb.append("\n");
		}
		catch (JSONException exJson)
		{
			sb = new StringBuilder();
			sb.append(_jsn.toString());
		}

		final AlertDialog pDlg = new AlertDialog.Builder(this).create();
		pDlg.setTitle("UniPin Android SDK");
		pDlg.setMessage(sb.toString());
		pDlg.setButton(	AlertDialog.BUTTON_POSITIVE,
						"OK",
						new DialogInterface.OnClickListener()
						{
							@Override
							public void onClick(DialogInterface dialog, int which)
							{
								pDlg.dismiss();
							}
						}
		);

		pDlg.show();
	}
}
