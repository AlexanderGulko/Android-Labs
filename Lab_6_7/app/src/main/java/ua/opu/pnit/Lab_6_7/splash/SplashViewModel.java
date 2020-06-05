package ua.opu.pnit.Lab_6_7.splash;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import ua.opu.pnit.Lab_6_7.repository.AppRepository;

public class SplashViewModel extends AndroidViewModel {

    private AppRepository repository;

    private MutableLiveData<Boolean> authResult = new MutableLiveData<>();

    public LiveData<Boolean> getAuthResultLiveData() {
        return authResult;
    }

    public SplashViewModel(@NonNull Application application) {
        super(application);

        repository = AppRepository.getInstance(application);
    }

    public void checkToken() {
        repository.checkToken(authResult);
    }
}
