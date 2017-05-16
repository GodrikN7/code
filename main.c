#include <stdio.h>
#include <stdlib.h>
#define N 50
#include <string.h>
#define MAX 20

//rodrigo
void elegirMenu();
void menuMedico(char numColegiado);
void menuSecretario(char numColegiado);
//enrique
int identificacion();
//oscar
void comprobarDni();
//juanfran
int registrarEspecialista();
int numCorrecto (char numColeg[9]);
int yaRegistrado (FILE *flMedicos, char numColeg[9]);
void escribirHorario(FILE *flHorarios, char numColeg[9]);

int main() {
  system("@cls || clear");
  int rol = identificacion();
  elegirMenu(rol);
  return 0;
}

void elegirMenu(int rol) {
  if(rol == 2) {menuMedico();}
  else if(rol == 1){menuSecretario();}
  else {printf("Error, no se ha detectado rol\n");}
}

void menuMedico() {
  char rol[N] = "Medico Especialista";
  int opcion, opcionSubmenu, seguir = 1;
  int numOpciones = 2;
  char enter;
  while(seguir){
    do{
      system("@cls || clear");

      printf("Usuario registrado como: %s.\n", rol);
      printf("\n\nElige una opcion:\n");
      printf("1.\t Comprobar DNI paciente.\n");
      printf("2.\t Ejemplo submenu 2\n");

      printf("\n0.\t Salir\n");

      scanf("%d", &opcion);
      system("@cls || clear");
      if (opcion < 0 || opcion > numOpciones) {
        printf("Opcion incorrecta\n");
      }
    }while(opcion < 0 || opcion > numOpciones);
    printf("Opcion %d elegida:\n", opcion);
    switch (opcion) {
      case 1:
        comprobarDni();
        printf("\n\nPresione <M> para volver al menu\n");
        do{
          scanf("%c", &enter);
        }while(enter != 'm' && enter != 'M');
      break;
      case 2:
        numOpciones = 2;
        do{
          system("@cls || clear");
          printf("\n\nElige una opcion:\n");
          printf("1.\t Opcion 1\n");
          printf("2.\t Opcion 2\n");
          printf("\n0.\t Atras\n");

          scanf("%d", &opcionSubmenu);
          system("@cls || clear");

          if (opcionSubmenu < 0 || opcionSubmenu > numOpciones) {
            printf("Opcion incorrecta\n");
          }
        }while(opcionSubmenu < 0 || opcionSubmenu > numOpciones);
        if(opcionSubmenu != 0){
          printf("Opcion %d elegida:\n", opcion);
        }
        switch (opcionSubmenu) {
          case 1:
            printf("Has elegido opcion 2.1\n");
            break;
          case 2:
            printf("Has elegido opcion 2.2\n");
            break;
          case 0:
            seguir = 1;
            break;
        }
      case 0:
        if(opcion == 0){
          seguir = 0;
        }
        break;
    }
  }
  printf("SALIR\n");
}

void menuSecretario() {
  char enter;
  char rol[] = "Secretario";
  int opcion, opcionSubmenu, seguir = 1;
  int numOpciones = 2;
   while(seguir){
    do{
      system("@cls || clear");

      printf("Usuario registrado como: %s.\n", rol);
      printf("\n\nElige una opcion:\n");
      printf("1.\t Comprobar DNI paciente.\n");
      printf("2.\t Registrar medico especialista.\n");


      printf("\n0.\t Salir\n");

      scanf("%d", &opcion);
      system("@cls || clear");
      if (opcion < 0 || opcion > numOpciones) {
        printf("Opcion incorrecta\n");
      }
    }while(opcion < 0 || opcion > numOpciones);
    printf("Opcion %d elegida:\n", opcion);
    switch (opcion) {
      case 1:
        comprobarDni();
        printf("\n\nPresione <M> para volver al menu\n");
        do{
          scanf("%c", &enter);
        }while(enter != 'm' && enter != 'M');
      break;
      case 2:
        registrarEspecialista();
        printf("\n\nPresione <M> para volver al menu\n");
        do{
          scanf("%c", &enter);
        }while(enter != 'm' && enter != 'M');
      case 0:
        if(opcion == 0){
          seguir = 0;
        }
        break;
    }
  }
  printf("SALIR\n");
}

void comprobarDni()
{
     int igual=0;//Variable booleana que comprueba si los dnis son iguales
    int resp;//Variable para almacenar la respuesta de si tiene seguro

    char dni[10];// dni que se lee por teclado
    char dniFichero[10];//dni que se lee del fichero

    //Datos que se guardan en el fichero
    char nombre [MAX];
    char apellido1[MAX];
    char apellido2[MAX];
    char compania[MAX] = "No";
    int longi;

    //Variables para leer el fichero
    char nombreF [MAX];
    char apellido1F[MAX];
    char apellido2F[MAX];
    char companiaF[MAX];

    FILE *fichero;
    fichero = fopen("pacientes.txt","a+");


    //Si el fichero no se abre
    if(fichero == NULL)
    {
        printf("\n      Error al abrir el fichero\n      ");
    }

    else
    {

        do {

            printf("\n\n      Por favor introduzca el DNI del paciente\n      ");
            scanf("%s",dni);
            longi = strlen(dni);
            if(longi!=9){
                printf("\n      Longitud de DNI incorrecta \n");
            }

        }while(longi!=9);


        while( fscanf(fichero, "%s %s %s %s %s\n", dniFichero, nombreF, apellido1F, apellido2F, companiaF) != EOF && igual == 0)
        {
            if(strcmp(dni,dniFichero)==0){
                igual = 1;
                printf("\n -------------------------------------------------------------------------------\n");
                printf("\n      El paciente ya existe\n");
                printf("            -DNI : %s.\n            -Nombre : %s.\n            -Primer Apellido : %s.\n            -Segundo Apellido : %s.\n            -Seguro : %s.\n",dniFichero,nombreF,apellido1F,apellido2F,companiaF);
            }
        }

        if(igual==0)
        {

            printf("\n      Introduzca el nombre del nuevo paciente\n      ");
            scanf("%s",nombre);
            fflush(stdin);

            printf("\n      Introduzca el primer apellido del nuevo paciente\n      ");
            scanf("%s",apellido1);
            fflush(stdin);

            printf("\n      Introduzca el segundo apellido del nuevo paciente(Si no tiene '-')\n      ");
            scanf("%s",apellido2);
            fflush(stdin);



            printf("\n      El nuevo paciente tiene compania de seguros?(Si=1,No=0)\n      ");
            scanf("%d",&resp);
            if(resp!=0)
            {
                printf("\n      Introduzca el nombre de la compania de seguros\n      ");
                scanf("%s",compania);
                fflush(stdin);
            }


            fprintf(fichero,"%s %s %s %s %s\n",dni,nombre,apellido1,apellido2,compania);

            printf("\n -------------------------------------------------------------------------------\n");
            printf("\n      El nuevo paciente se ha registrado correctamente con los siguientes datos:\n");
            printf("            -DNI : %s.\n            -Nombre : %s.\n            -Primer Apellido : %s.\n            -Segundo Apellido : %s.\n            -Seguro : %s.\n",dni,nombre,apellido1,apellido2,compania);
        }
        /*else if(igual==1) {
            printf("\n -------------------------------------------------------------------------------\n");
            printf("\n      El paciente ya existe\n      ");
        }*/
        fclose(fichero);
    }
}

int identificacion()
{

    char usuario[MAX]="";
    char usuariof[MAX]="";
    char contr[MAX]="";
    char contrf[MAX]="";
    int tipou;
    int enc =0;
    FILE *login;
    fpos_t posicion;
    login = fopen("login.txt", "r");
    do{
        printf("Usuario: ");
        scanf("%s", usuario);
        fflush(stdin);
        printf("Clave: ");
        scanf("%s", contr);
        fflush(stdin);
        fgetpos(login, &posicion); // Guarda la posicion actual del puntero de fichero;

        while(getc(login)!=EOF && !enc)
        {
            fsetpos(login, &posicion);                                 // recoloca el puntero donde estaba antes de comprobar que no ha llegado a EOF
            fscanf(login,"%s %s %d", usuariof, contrf, &tipou);//para no perder posible informacion;
            if(strcmp(usuario, usuariof) == 0)
            {
                if(strcmp(contr, contrf) == 0)
                {
                    enc = 1;
                }
            }
        fgetpos(login, &posicion); // Guarda la posicion actual del puntero de fichero;
        }
    if(enc){
        printf("identificacion completada con exito.\n");
        if(tipou==1)
            printf("hola secretari@!\n");
        else printf("hola medico!\n");
   }
    else {
            printf("usuario o clave incorrectas\n");
    }
    fseek(login, 0, SEEK_SET);
    }while(!enc);
    fclose(login);
    return tipou;
}

int registrarEspecialista()
{
    FILE *flMedicos;
    FILE *login;
    FILE *flHorarios;

    char numColeg[9];        // numero del colegiado (9 cifras) y usuario para el login
    char pass[MAX];          // clave del especialista
    char passComp[MAX];      // comprobacion clave del especialista
    int correcto = 0;		 // simula un booleano

    char nombre[MAX];        // nombre del especialista
    char apellido1[MAX];     // apellidos del especialista
    char apellido2[MAX];

    int numEspec = 1;        // numero de especialidades
    int i = 1;               // contador para las especialidades
    char espec1[MAX] = "";	 // especialidades
    char espec2[MAX] = "";
    char espec3[MAX] = "";

    int tmin;                // tiempo minimo de consulta

    flMedicos = fopen("especialistas.txt", "a+");
    if (flMedicos == NULL) {
        printf("*ERROR*: ha habido un fallo al abrir el fichero de especialistas.");
        return 1;
    }

    login = fopen("login.txt", "a");
    if (login == NULL) {
        printf("*ERROR*: ha habido un fallo al abrir el fichero de login.");
        return 1;
    }

    flHorarios = fopen("horarios.txt", "a");
    if (flHorarios == NULL) {
        printf("*ERROR*: ha habido un fallo al abrir el fichero de horarios.");
        return 1;
    }

	printf ("Para registrar un nuevo especialista comience introduciendo sus datos de acceso.");
	printf ("\n--------------------------------------------------------------------------------");

	do {
    printf ("\nNumero de colegiado (9 valores): ");
    scanf ("%s", numColeg);

    fflush(stdin);
    if (numCorrecto(numColeg) != 1)
    	printf ("\nFormato de numero de colegiado incorrecto. Debe tener 9 digitos.");
    } while (numCorrecto(numColeg) != 1);
    correcto = 0;

    if (yaRegistrado(flMedicos, numColeg) == 1) {
    	printf("*ERROR*: Ese especialista ya esta registrado");
    	return 2;
	}

	do {
		printf ("\nClave de acceso: ");
    	scanf ("%s", pass);
    	fflush(stdin);
   		printf ("\nConfirme la clave de acceso: ");
    	scanf ("%s", passComp);
    	fflush(stdin);
    	if (strcmp(pass, passComp) == 0)
    		correcto = 1;
    	else printf("\nLas claves no coinciden. Pruebe de nuevo:");
	} while (!correcto);
	correcto = 0;

    printf ("\nA continuacion, complete el perfil con los datos oportunos.");
    printf ("\n--------------------------------------------------------------------------------\n");
    printf ("\nNombre del especialista: ");
    scanf ("%s", nombre);
    fflush(stdin);
    printf ("\nPrimer apellido del especialista: ");
    scanf ("%s", apellido1);
    fflush(stdin);
    printf ("\nSegundo apellido del especialista: ");
    scanf ("%s", apellido2);
    fflush(stdin);
    printf ("\nNumero de especialidades (Max = 3): ");
    scanf ("%d", &numEspec);
    fflush(stdin);

    while (i <= numEspec) {
        printf("\n\t- Especialidad num %d: ", i);
        if (i == 1) {
            scanf("%s", espec1);
            fflush(stdin);
        }
        else if (i == 2) {
            scanf("%s", espec2);
            fflush(stdin);
        }
        else if (i == 3) {
            scanf("%s", espec3);
            fflush(stdin);
        }
        i++;
    }

    printf("\nTiempo minimo de consulta (minutos): ");
    scanf ("%d", &tmin);
    fflush(stdin);

	printf ("\nPor ultimo, introduzca el horario del especialista.");
	printf ("\n--------------------------------------------------------------------------------");
	printf ("\nInstrucciones:");
	printf ("\n\t1 - Usar el formato 24h.");
	printf ("\n\t2 - Separar las horas de inicio y final con un espacio.");
	printf ("\n\t3 - Si tiene uno o mas dias libres, introducir 0 espacio 0.");
	printf ("\n--------------------------------------------------------------------------------\n");

	fprintf(login, "%s %s 2\n", numColeg, pass);
    fprintf(flMedicos, "%s %s %s %s %s;%s;%s %d\n", numColeg, nombre, apellido1, apellido2, espec1, espec2, espec3, tmin);
    escribirHorario(flHorarios, numColeg);

	fclose(login);
    fclose(flMedicos);
    fclose(flHorarios);

    printf ("\nEspecialista registrado con exito.");
}

// comprueba si el numero introducido tiene el formato correcto
int numCorrecto (char numColeg[9]) {
    int i;
	i = strlen(numColeg);
	if (i != 9)
        return 0;
    else return 1;
}

// verifica si el especialista ya est� registrado
int yaRegistrado (FILE *flMedicos, char numColeg[9]) {
    char numColegiado[9];
    char nombre[20];
    char apellido1[20];
    char apellido2[20];
    char especialidades[50];
    int tmin;
    int i;

    while(fscanf(flMedicos, "%s %s %s %s %s %d", numColegiado, nombre, apellido1, apellido2, especialidades, &tmin) != -1)
    {
        if(strcmp(numColegiado, numColeg) == 0)
        {
            return 1;
            break;
        }
    }

    return 0;
}

void escribirHorario (FILE *flHorarios, char numColeg[9]) {
    fprintf(flHorarios, "%s\n", numColeg);
    int inicio = 0;
	int final = 0;

	printf("\nLunes: ");
	scanf("%d %d", &inicio, &final);
	fflush(stdin);
	fprintf(flHorarios, "Lunes: %d-%d\n", inicio, final);

	printf("\nMartes: ");
	scanf("%d %d", &inicio, &final);
	fflush(stdin);
	fprintf(flHorarios, "Martes: %d-%d\n", inicio, final);

	printf("\nMiercoles: ");
	scanf("%d %d", &inicio, &final);
	fflush(stdin);
	fprintf(flHorarios, "Miercoles: %d-%d\n", inicio, final);

	printf("\nJueves: ");
	scanf("%d %d", &inicio, &final);
	fflush(stdin);
	fprintf(flHorarios, "Jueves: %d-%d\n", inicio, final);

	printf("\nViernes: ");
	scanf("%d %d", &inicio, &final);
	fflush(stdin);
	fprintf(flHorarios, "Viernes: %d-%d\n", inicio, final);

	printf("\nSabado: ");
	scanf("%d %d", &inicio, &final);
	fflush(stdin);
	fprintf(flHorarios, "Sabado: %d-%d\n", inicio, final);

	printf("\nDomingo: ");
	scanf("%d %d", &inicio, &final);
	fflush(stdin);
	fprintf(flHorarios, "Domingo: %d-%d\n\n", inicio, final);
}
