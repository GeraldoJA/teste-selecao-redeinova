import {ComponentFixture, TestBed} from '@angular/core/testing';

import {HistoricoDialogComponent} from './historico-dialog.component';
import {AppModule} from "../../app.module";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

describe('HistoricoDialogComponent', () => {
  let component: HistoricoDialogComponent;
  let fixture: ComponentFixture<HistoricoDialogComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [
        AppModule
      ], providers: [
        {provide: MAT_DIALOG_DATA, useValue: {}},
        {provide: MatDialogRef, useValue: {}}
      ]
    })
      .compileComponents();

    fixture = TestBed.createComponent(HistoricoDialogComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
