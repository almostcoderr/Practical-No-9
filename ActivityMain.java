Button register;
        EditText name,email,phone;
RadioGroup genderGroup;
CheckBox terms;

register.setOnClickListener(v -> {

        if(!terms.isChecked())
        {
        Toast.makeText(this,
                               "Accept Terms First",
                       Toast.LENGTH_SHORT).show();
return;
        }

int selectedId =
        genderGroup.getCheckedRadioButtonId();

RadioButton gender =
        findViewById(selectedId);

String g = gender.getText().toString();

Toast.makeText(this,
                       "Registered Successfully\nGender: "+g,
               Toast.LENGTH_LONG).show();

});