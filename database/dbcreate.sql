CREATE TABLE CUSTOMER
(

    CU_Account         CHAR(25) NOT NULL,
    CU_Name            CHAR(25) NOT NULL,
    CU_Age             int(10)  NOT NULL,
    CU_Password        CHAR(10) NOT NULL,
    CU_IsMember        boolean  NOT NULL,
    CU_Longitude       double   NOT NULL,
    CU_Latitude        double   NOT NULL,
    CU_remainingAmount double   NOT NULL,

    CONSTRAINT CUSTOMER_PKEY PRIMARY KEY (CU_Account)

);

CREATE TABLE CAR
(

    C_Rego     CHAR(25) NOT NULL,
    C_Color    CHAR(25) NOT NULL,
    C_Brand    CHAR(25) NOT NULL,
    C_Describe CHAR(25) NOT NULL,
    C_Status   CHAR(25) NOT NULL,
    CU_Account CHAR(25) NOT NULL,

    CONSTRAINT CAR_PKEY PRIMARY KEY (C_Rego),
    CONSTRAINT CAR_FKEY FOREIGN KEY (CU_Account)
        REFERENCES CUSTOMER (CU_Account)
);

CREATE TABLE ASSISTANT
(

    AS_Account   CHAR(25) NOT NULL,
    AS_Name      CHAR(25) NOT NULL,
    AS_Age       int(10)  NOT NULL,
    AS_Password  CHAR(25) NOT NULL,
    AS_IsPass    boolean  NOT NULL,
    AS_IsIdle    boolean  NOT NULL,
    AS_Longitude double   NOT NULL,
    AS_Latitude  double   NOT NULL,
    AS_Balance   double   NOT NULL,

    CONSTRAINT Assistant_PKEY PRIMARY KEY (AS_Account)

);

CREATE TABLE ADMIN
(

    AD_Account  CHAR(25) NOT NULL,
    AD_Name     CHAR(25) NOT NULL,
    AD_Age      int(10)  NOT NULL,
    AD_Password CHAR(25) NOT NULL,
    AS_Account  CHAR(25) NOT NULL,

    CONSTRAINT Assistant_PKEY PRIMARY KEY (AD_Account),
    CONSTRAINT ORDER_FKEY FOREIGN KEY (AS_Account)
        REFERENCES ASSISTANT (AS_Account)
);

CREATE TABLE ORDERS
(

    O_OrderID  int(10)  NOT NULL,
    O_Describe CHAR(25) NOT NULL,
    O_Price    double  NOT NULL,
    CU_Account CHAR(25) NOT NULL,
    AS_Account CHAR(25) NOT NULL,

    CONSTRAINT ORDERS_PKEY PRIMARY KEY (O_OrderID),
    CONSTRAINT ORDERS_FKEY1 FOREIGN KEY (CU_Account)
        REFERENCES CUSTOMER (CU_Account),
    CONSTRAINT ORDERS_FKEY2 FOREIGN KEY (AS_Account)
        REFERENCES Assistant (AS_Account)
);