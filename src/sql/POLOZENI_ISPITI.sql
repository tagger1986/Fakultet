--------------------------------------------------------
--  File created - Tuesday-October-10-2017   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table POLOZENI_ISPITI
--------------------------------------------------------

  CREATE TABLE "FAKULTET"."POLOZENI_ISPITI" 
   (	"ID" NUMBER(10,0), 
	"STUDENT_ID" NUMBER(10,0), 
	"PREDMET_ID" NUMBER(10,0), 
	"CREATION_DATE" DATE DEFAULT SYSDATE, 
	"CREATED_BY" NUMBER(10,0) DEFAULT 1, 
	"LAST_UPDATED_DATE" DATE, 
	"LAST_UPDATED_BY" NUMBER(10,0), 
	"ROW_STATUS" VARCHAR2(1 BYTE) DEFAULT 'A', 
	"GRADE" NUMBER(10,0) DEFAULT 5
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
REM INSERTING into FAKULTET.POLOZENI_ISPITI
SET DEFINE OFF;
Insert into FAKULTET.POLOZENI_ISPITI (ID,STUDENT_ID,PREDMET_ID,CREATION_DATE,CREATED_BY,LAST_UPDATED_DATE,LAST_UPDATED_BY,ROW_STATUS,GRADE) values (1,1,101,to_date('03-OCT-17','DD-MON-RR'),1,to_date('10-OCT-17','DD-MON-RR'),1,'a',5);
Insert into FAKULTET.POLOZENI_ISPITI (ID,STUDENT_ID,PREDMET_ID,CREATION_DATE,CREATED_BY,LAST_UPDATED_DATE,LAST_UPDATED_BY,ROW_STATUS,GRADE) values (2,4,101,to_date('03-OCT-17','DD-MON-RR'),1,to_date('04-OCT-17','DD-MON-RR'),1,'b',5);
Insert into FAKULTET.POLOZENI_ISPITI (ID,STUDENT_ID,PREDMET_ID,CREATION_DATE,CREATED_BY,LAST_UPDATED_DATE,LAST_UPDATED_BY,ROW_STATUS,GRADE) values (3,1,102,to_date('04-OCT-17','DD-MON-RR'),2,to_date('04-OCT-17','DD-MON-RR'),1,'a',5);
--------------------------------------------------------
--  DDL for Index POLOZENI_ISPITI_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "FAKULTET"."POLOZENI_ISPITI_PK" ON "FAKULTET"."POLOZENI_ISPITI" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  Constraints for Table POLOZENI_ISPITI
--------------------------------------------------------

  ALTER TABLE "FAKULTET"."POLOZENI_ISPITI" MODIFY ("GRADE" NOT NULL ENABLE);
  ALTER TABLE "FAKULTET"."POLOZENI_ISPITI" ADD CONSTRAINT "POLOZENI_ISPITI_PK" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "FAKULTET"."POLOZENI_ISPITI" MODIFY ("ROW_STATUS" NOT NULL ENABLE);
  ALTER TABLE "FAKULTET"."POLOZENI_ISPITI" MODIFY ("LAST_UPDATED_BY" NOT NULL ENABLE);
  ALTER TABLE "FAKULTET"."POLOZENI_ISPITI" MODIFY ("LAST_UPDATED_DATE" NOT NULL ENABLE);
  ALTER TABLE "FAKULTET"."POLOZENI_ISPITI" MODIFY ("CREATED_BY" NOT NULL ENABLE);
  ALTER TABLE "FAKULTET"."POLOZENI_ISPITI" MODIFY ("CREATION_DATE" NOT NULL ENABLE);
  ALTER TABLE "FAKULTET"."POLOZENI_ISPITI" MODIFY ("PREDMET_ID" NOT NULL ENABLE);
  ALTER TABLE "FAKULTET"."POLOZENI_ISPITI" MODIFY ("STUDENT_ID" NOT NULL ENABLE);
  ALTER TABLE "FAKULTET"."POLOZENI_ISPITI" MODIFY ("ID" NOT NULL ENABLE);
