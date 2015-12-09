package com.example.s2108867.mapsandcows;

import android.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity {

    private GoogleMap mMap; // Might be null if Google Play services APK is not available.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        setUpMapIfNeeded();
    }

    @Override
    protected void onResume() {
        super.onResume();
        setUpMapIfNeeded();
    }

    /**
     * Sets up the map if it is possible to do so (i.e., the Google Play services APK is correctly
     * installed) and the map has not already been instantiated.. This will ensure that we only ever
     * call {@link #setUpMap()} once when {@link #mMap} is not null.
     * <p/>
     * If it isn't installed {@link SupportMapFragment} (and
     * {@link com.google.android.gms.maps.MapView MapView}) will show a prompt for the user to
     * install/update the Google Play services APK on their device.
     * <p/>
     * A user can return to this FragmentActivity after following the prompt and correctly
     * installing/updating/enabling the Google Play services. Since the FragmentActivity may not
     * have been completely destroyed during this process (it is likely that it would only be
     * stopped or paused), {@link #onCreate(Bundle)} may not be called again so we should call this
     * method in {@link #onResume()} to guarantee that it will be called.
     */
    private void setUpMapIfNeeded() {
        // Do a null check to confirm that we have not already instantiated the map.
        if (mMap == null) {
            // Try to obtain the map from the SupportMapFragment.
            mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map))
                    .getMap();
            // Check if we were successful in obtaining the map.
            if (mMap != null) {
                setUpMap();
            }
        }
        View interfaceview;

        if (interfaceview==null){
            interfaceview=getSupportFragmentManager().findFragmentById(R.id.interact).getView();
        }
    }
    Marker israel;
    Marker kabul;
    Marker england;
    Marker newyork;
    Marker timbuktu;
    Marker lubbock;
    /**
     * This is where we can add markers or lines, add listeners or move the camera. In this case, we
     * just add a marker near Africa.
     * <p/>
     * This should only be called once and when we are sure that {@link #mMap} is not null.
     */
    private void setUpMap() {
        israel=mMap.addMarker(new MarkerOptions()
                .position(new LatLng(31, 35))
                .title("Israel")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.cowmarker))
                .snippet("CORRECT!")
        );
        kabul = mMap.addMarker(new MarkerOptions()
                        .position(new LatLng(34, 69))
                        .title("Kabul")
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.cowmarker))
                        .snippet("WRONG!")
        );
         england= mMap.addMarker(new MarkerOptions()
                        .position(new LatLng(52, -1))
                        .title("England")
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.cowmarker))
                        .snippet("Wrong!")
        );
         newyork= mMap.addMarker(new MarkerOptions()
                        .position(new LatLng(40, -74))
                        .title("Kabul")
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.cowmarker))
                        .snippet("WRONG!")
        );
         timbuktu= mMap.addMarker(new MarkerOptions()
                        .position(new LatLng(16, -3))
                        .title("Timbuktu")
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.cowmarker))
                        .snippet("WRONG!")
         );
         lubbock= mMap.addMarker(new MarkerOptions()
                 .position(new LatLng(33, -101.855072))
                 .title("Lubbock")
                 .icon(BitmapDescriptorFactory.fromResource(R.drawable.cowmarker))
                 .snippet(" a nice little town in the middle of")
        );
    }

    public static class InteractiveFragment extends Fragment {
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            return inflater.inflate(R.layout.layoutport, container, false);
        }
    }
}


// Where is the illuminati located?
