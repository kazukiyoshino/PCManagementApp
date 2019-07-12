package com.model.pc;

import javax.validation.Valid;

import com.model.pc.cpu.CPU;
import com.model.pc.createAt.PCCreateAt;
import com.model.pc.memory.Memory;
import com.model.pc.os.OS;
import com.model.pc.software.office.Office;
import com.model.pc.storage.Storage;
import com.model.pc.usecategory.UseCategory;


public class PC {
	private PCId pcId;
	@Valid
	private PCName pcName;
	@Valid
	private PCNote pcNote;
	private PCCategory pcCategory;
	private PCCreateAt pcCreateAt;
	@Valid
	private Office office;
	@Valid
	private Memory memory;
	@Valid
	private Storage storage;
	private UseCategory useCategory;
	@Valid
	private OS os;
	@Valid
	private CPU cpu;

	public PC() {
		pcName = new PCName();
		pcNote = new PCNote();
		pcCreateAt = new PCCreateAt();
		office = new Office();
		memory = new Memory();
		storage = new Storage();
		useCategory = new UseCategory();
		os = new OS();
		cpu = new CPU();


	}

	public PC(PCId pcId, PCName pcName, PCNote pcNote, PCCategory pcCategory, PCCreateAt pcCreateAt, Office office,
			Memory memory, Storage storage, UseCategory useCategory, OS os, CPU cpu) {
		this.pcId = pcId;
		this.pcName = pcName;
		this.pcNote = pcNote;
		this.pcCategory = pcCategory;
		this.pcCreateAt = pcCreateAt;
		this.office = office;
		this.memory = memory;
		this.storage = storage;
		this.useCategory = useCategory;
		this.os = os;
		this.cpu = cpu;
	}


	public PCId getPcId() {
		return pcId;
	}

	public void setPcId(PCId pcId) {
		this.pcId = pcId;
	}

	public PCName getPcName() {
		return pcName;
	}

	public void setPcName(PCName pcName) {
		this.pcName = pcName;
	}

	public PCNote getPcNote() {
		return pcNote;
	}

	public void setPcNote(PCNote pcNote) {
		this.pcNote = pcNote;
	}

	public PCCategory getPcCategory() {
		return pcCategory;
	}

	public void setPcCategory(PCCategory pcCategory) {
		this.pcCategory = pcCategory;
	}

	public PCCreateAt getPcCreateAt() {
		return pcCreateAt;
	}

	public void setPcCreateAt(PCCreateAt pcCreateAt) {
		this.pcCreateAt = pcCreateAt;
	}

	public Office getOffice() {
		return office;
	}

	public void setOffice(Office office) {
		this.office = office;
	}

	public Memory getMemory() {
		return memory;
	}

	public void setMemory(Memory memory) {
		this.memory = memory;
	}

	public Storage getStorage() {
		return storage;
	}

	public void setStorage(Storage storage) {
		this.storage = storage;
	}

	public UseCategory getUseCategory() {
		return useCategory;
	}

	public void setUseCategory(UseCategory useCategory) {
		this.useCategory = useCategory;
	}

	public OS getOs() {
		return os;
	}

	public void setOs(OS os) {
		this.os = os;
	}

	public CPU getCpu() {
		return cpu;
	}

	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}

	@Override
	public String toString() {
		return "PC [pcId=" + pcId + ", pcName=" + pcName + ", pcNote=" + pcNote + ", pcCategory=" + pcCategory
				+ ", pcCreateAt=" + pcCreateAt + ", office=" + office + ", memory=" + memory + ", storage=" + storage
				+ ", useCategory=" + useCategory + ", os=" + os + ", cpu=" + cpu + "]";
	}

}
