package com.kp.cricketscorecounter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	int s,r,f,si,j,w,k;
int o,t;
	Button run,four,six,score,extras,wicket,overs,reset,crun,cfour,csix,cextras,cwicket;
	TextView scored,over,runs,fours,sixes,extra;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		s=0;
		r=0;
		f=0;
		si=0;
		j=0;
		w=0;
		o=0;
		t=0;
		run=(Button)findViewById(R.id.button1);
		four=(Button)findViewById(R.id.button2);
		six=(Button)findViewById(R.id.button3);
		extras=(Button)findViewById(R.id.button4);
		wicket=(Button)findViewById(R.id.button5);
		overs=(Button)findViewById(R.id.button6);
		reset=(Button)findViewById(R.id.button7);
		crun=(Button)findViewById(R.id.button8);
		cfour=(Button)findViewById(R.id.Button03);
		csix=(Button)findViewById(R.id.Button02);
		cextras=(Button)findViewById(R.id.button10);
		cwicket=(Button)findViewById(R.id.button9);
		scored=(TextView)findViewById(R.id.textView6);
		over=(TextView)findViewById(R.id.textView1);
		runs=(TextView)findViewById(R.id.textView5);
		fours=(TextView)findViewById(R.id.textView4);
		sixes=(TextView)findViewById(R.id.textView3);
		extra=(TextView)findViewById(R.id.textView2);
		run.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				r=r+1;
				s=s+1;
				scored.setText("SCORE : "+s+" / "+w);
				runs.setText("             "+r);
			}
		});
		four.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				f=f+4;
				s=s+4;
				scored.setText("SCORE : "+s+" / "+w);
				fours.setText("             "+f);
			}
		});
		six.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				s=s+6;
				si=si+6;
				scored.setText("SCORE : "+s+" / "+w);
				sixes.setText("             "+si);
			}
		});		
		extras.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				j=j+1;
				s=s+1;
				scored.setText("SCORE : "+s+" / "+w);
				extra.setText("             " +j);
			}
		});
        wicket.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				w=w+1;
				scored.setText("SCORE : "+s+" / "+w);
			}
		});
        reset.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				t=0;
				s=0;
				r=0;
				f=0;
				si=0;
				j=0;
				w=0;
				o=0;
				scored.setText("SCORE : "+s+" / "+w);
				runs.setText("             "+r);
				fours.setText("             "+f);
				sixes.setText("             "+si);
				extra.setText("             "+j);
				over.setText("OVERS :  "+o+"."+t);
				
			}
		});
        crun.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				r=r-1;
				s=s-1;
				scored.setText("SCORE : "+s+" / "+w);
				runs.setText("             "+r);
			}
		});
        cfour.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				f=f-4;
				s=s-4;
				scored.setText("SCORE : "+s+" / "+w);
				fours.setText("             "+f);
			}
		});        
        csix.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			si=si-6;
			s=s-6;
			scored.setText("SCORE : "+s+" / "+w);
			sixes.setText("             "+si);
		}
	});     
        cwicket.setOnClickListener(new View.OnClickListener() {
    		
    		@Override
    		public void onClick(View v) {
    			// TODO Auto-generated method stub
    			w=w-1;
    			scored.setText("SCORE : "+s+" / "+w);
    			
    		}
    	});     
       cextras.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			j=j-1;
			s=s-1;
			scored.setText("SCORE : "+s+" / "+w);
			extra.setText("             "+j);
		}
	});
        overs.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				t=t+1;
				if(t==6){
					o=o+1;
					t=0;
				}
				over.setText("OVERS :  "+o+"."+t);
				
			}
		});
        return true;
	}

}
