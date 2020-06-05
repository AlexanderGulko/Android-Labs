package ua.opu.pnit.Lab_6_7.login;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import ua.opu.pnit.Lab_6_7.repository.AppRepository;

public class LoginViewModel extends AndroidViewModel {

    private AppRepository repository;

    private MutableLiveData<Boolean> loginResult = new MutableLiveData<>();

    public LiveData<Boolean> getLoginResultLiveData() {
        return loginResult;
    }

    public LoginViewModel(@NonNull Application application) {
        super(application);

        repository = AppRepository.getInstance(application);
    }

    public void loginAttempt(String username, String password) {
        repository.loginAttempt(username, password, loginResult);
    }
}
