/*  Copyright (c) 2012 by Vincent Pacelli and Omar Rizwan

    This file is part of Gabby.

    Gabby is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    Gabby is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with Gabby.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.gambo.core;

public class Clock {
	// clock cycles used by each opcode
	public static final int[] CYCLES = new int[0x100];
	static {
		CYCLES[0x00] = 4;
		CYCLES[0x01] = 12;
		CYCLES[0x02] = 8;
		CYCLES[0x03] = 8;
		CYCLES[0x04] = 4;
		CYCLES[0x05] = 4;
		CYCLES[0x06] = 8;
		CYCLES[0x07] = 4;
		CYCLES[0x08] = 20;
		CYCLES[0x09] = 8;
		CYCLES[0x0A] = 8;
		CYCLES[0x0B] = 8;
		CYCLES[0x0C] = 4;
		CYCLES[0x0D] = 4;
		CYCLES[0x0E] = 8;
		CYCLES[0x0F] = 4;
		CYCLES[0x10] = 4;
		CYCLES[0x11] = 12;
		CYCLES[0x12] = 8;
		CYCLES[0x13] = 8;
		CYCLES[0x14] = 4;
		CYCLES[0x15] = 4;
		CYCLES[0x16] = 8;
		CYCLES[0x17] = 4;
		CYCLES[0x18] = 8;
		CYCLES[0x19] = 8;
		CYCLES[0x1A] = 8;
		CYCLES[0x1B] = 8;
		CYCLES[0x1C] = 4;
		CYCLES[0x1D] = 4;
		CYCLES[0x1E] = 8;
		CYCLES[0x1F] = 4;
		CYCLES[0x20] = 8;
		CYCLES[0x21] = 12;
		CYCLES[0x22] = 8;
		CYCLES[0x23] = 8;
		CYCLES[0x24] = 4;
		CYCLES[0x25] = 4;
		CYCLES[0x26] = 8;
		CYCLES[0x27] = 4;
		CYCLES[0x28] = 8;
		CYCLES[0x29] = 8;
		CYCLES[0x2A] = 8;
		CYCLES[0x2B] = 8;
		CYCLES[0x2C] = 4;
		CYCLES[0x2D] = 4;
		CYCLES[0x2E] = 8;
		CYCLES[0x2F] = 4;
		CYCLES[0x30] = 8;
		CYCLES[0x31] = 12;
		CYCLES[0x32] = 8;
		CYCLES[0x33] = 8;
		CYCLES[0x34] = 12;
		CYCLES[0x35] = 12;
		CYCLES[0x36] = 12;
		CYCLES[0x37] = 4;
		CYCLES[0x38] = 8;
		CYCLES[0x39] = 8;
		CYCLES[0x3A] = 8;
		CYCLES[0x3B] = 8;
		CYCLES[0x3C] = 4;
		CYCLES[0x3D] = 4;
		CYCLES[0x3E] = 8;
		CYCLES[0x3F] = 4;
		CYCLES[0x40] = 4;
		CYCLES[0x41] = 4;
		CYCLES[0x42] = 4;
		CYCLES[0x43] = 4;
		CYCLES[0x44] = 4;
		CYCLES[0x45] = 4;
		CYCLES[0x46] = 8;
		CYCLES[0x47] = 4;
		CYCLES[0x48] = 4;
		CYCLES[0x49] = 4;
		CYCLES[0x4A] = 4;
		CYCLES[0x4B] = 4;
		CYCLES[0x4C] = 4;
		CYCLES[0x4D] = 4;
		CYCLES[0x4E] = 8;
		CYCLES[0x4F] = 4;
		CYCLES[0x50] = 4;
		CYCLES[0x51] = 4;
		CYCLES[0x52] = 4;
		CYCLES[0x53] = 4;
		CYCLES[0x54] = 4;
		CYCLES[0x55] = 4;
		CYCLES[0x56] = 8;
		CYCLES[0x57] = 4;
		CYCLES[0x58] = 4;
		CYCLES[0x59] = 4;
		CYCLES[0x5A] = 4;
		CYCLES[0x5B] = 4;
		CYCLES[0x5C] = 4;
		CYCLES[0x5D] = 4;
		CYCLES[0x5E] = 8;
		CYCLES[0x5F] = 4;
		CYCLES[0x60] = 4;
		CYCLES[0x61] = 4;
		CYCLES[0x62] = 4;
		CYCLES[0x63] = 4;
		CYCLES[0x64] = 4;
		CYCLES[0x65] = 4;
		CYCLES[0x66] = 8;
		CYCLES[0x67] = 4;
		CYCLES[0x68] = 4;
		CYCLES[0x69] = 4;
		CYCLES[0x6A] = 4;
		CYCLES[0x6B] = 4;
		CYCLES[0x6C] = 4;
		CYCLES[0x6D] = 4;
		CYCLES[0x6E] = 8;
		CYCLES[0x6F] = 4;
		CYCLES[0x70] = 8;
		CYCLES[0x71] = 8;
		CYCLES[0x72] = 8;
		CYCLES[0x73] = 8;
		CYCLES[0x74] = 8;
		CYCLES[0x75] = 8;
		CYCLES[0x76] = 4;
		CYCLES[0x77] = 8;
		CYCLES[0x78] = 4;
		CYCLES[0x79] = 4;
		CYCLES[0x7A] = 4;
		CYCLES[0x7B] = 4;
		CYCLES[0x7C] = 4;
		CYCLES[0x7D] = 4;
		CYCLES[0x7E] = 8;
		CYCLES[0x7F] = 4;
		CYCLES[0x80] = 4;
		CYCLES[0x81] = 4;
		CYCLES[0x82] = 4;
		CYCLES[0x83] = 4;
		CYCLES[0x84] = 4;
		CYCLES[0x85] = 4;
		CYCLES[0x86] = 8;
		CYCLES[0x87] = 4;
		CYCLES[0x88] = 4;
		CYCLES[0x89] = 4;
		CYCLES[0x8A] = 4;
		CYCLES[0x8B] = 4;
		CYCLES[0x8C] = 4;
		CYCLES[0x8D] = 4;
		CYCLES[0x8E] = 8;
		CYCLES[0x8F] = 4;
		CYCLES[0x90] = 4;
		CYCLES[0x91] = 4;
		CYCLES[0x92] = 4;
		CYCLES[0x93] = 4;
		CYCLES[0x94] = 4;
		CYCLES[0x95] = 4;
		CYCLES[0x96] = 8;
		CYCLES[0x97] = 4;
		CYCLES[0x98] = 4;
		CYCLES[0x99] = 4;
		CYCLES[0x9A] = 4;
		CYCLES[0x9B] = 4;
		CYCLES[0x9C] = 4;
		CYCLES[0x9D] = 4;
		CYCLES[0x9E] = 8;
		CYCLES[0x9F] = 4;
		CYCLES[0xA0] = 4;
		CYCLES[0xA1] = 4;
		CYCLES[0xA2] = 4;
		CYCLES[0xA3] = 4;
		CYCLES[0xA4] = 4;
		CYCLES[0xA5] = 4;
		CYCLES[0xA6] = 8;
		CYCLES[0xA7] = 4;
		CYCLES[0xA8] = 4;
		CYCLES[0xA9] = 4;
		CYCLES[0xAA] = 4;
		CYCLES[0xAB] = 4;
		CYCLES[0xAC] = 4;
		CYCLES[0xAD] = 4;
		CYCLES[0xAE] = 8;
		CYCLES[0xAF] = 4;
		CYCLES[0xB0] = 4;
		CYCLES[0xB1] = 4;
		CYCLES[0xB2] = 4;
		CYCLES[0xB3] = 4;
		CYCLES[0xB4] = 4;
		CYCLES[0xB5] = 4;
		CYCLES[0xB6] = 8;
		CYCLES[0xB7] = 4;
		CYCLES[0xB8] = 4;
		CYCLES[0xB9] = 4;
		CYCLES[0xBA] = 4;
		CYCLES[0xBB] = 4;
		CYCLES[0xBC] = 4;
		CYCLES[0xBD] = 4;
		CYCLES[0xBE] = 8;
		CYCLES[0xBF] = 4;
		CYCLES[0xC0] = 8;
		CYCLES[0xC1] = 12;
		CYCLES[0xC2] = 12;
		CYCLES[0xC3] = 12;
		CYCLES[0xC4] = 12;
		CYCLES[0xC5] = 16;
		CYCLES[0xC6] = 8;
		CYCLES[0xC7] = 32;
		CYCLES[0xC8] = 8;
		CYCLES[0xC9] = 8;
		CYCLES[0xCA] = 12;
		CYCLES[0xCB] = 0;
		CYCLES[0xCC] = 12;
		CYCLES[0xCD] = 12;
		CYCLES[0xCE] = 8;
		CYCLES[0xCF] = 32;
		CYCLES[0xD0] = 8;
		CYCLES[0xD1] = 12;
		CYCLES[0xD2] = 12;
		CYCLES[0xD4] = 12;
		CYCLES[0xD5] = 16;
		CYCLES[0xD6] = 8;
		CYCLES[0xD7] = 32;
		CYCLES[0xD8] = 8;
		CYCLES[0xD9] = 8;
		CYCLES[0xDA] = 12;
		CYCLES[0xDC] = 12;
		CYCLES[0xDE] = 8;
		CYCLES[0xDF] = 32;
		CYCLES[0xE0] = 12;
		CYCLES[0xE1] = 12;
		CYCLES[0xE2] = 8;
		CYCLES[0xE5] = 16;
		CYCLES[0xE6] = 8;
		CYCLES[0xE7] = 32;
		CYCLES[0xE8] = 16;
		CYCLES[0xE9] = 4;
		CYCLES[0xEA] = 16;
		CYCLES[0xEE] = 8;
		CYCLES[0xEF] = 32;
		CYCLES[0xF0] = 12;
		CYCLES[0xF1] = 12;
		CYCLES[0xF2] = 8;
		CYCLES[0xF3] = 4;
		CYCLES[0xF5] = 16;
		CYCLES[0xF6] = 8;
		CYCLES[0xF7] = 32;
		CYCLES[0xF8] = 12;
		CYCLES[0xF9] = 8;
		CYCLES[0xFA] = 16;
		CYCLES[0xFB] = 4;
		CYCLES[0xFE] = 8;
		CYCLES[0xFF] = 32;
	}
	
	// clock cycles used by each secondary opcode
	public static final int[] CB_CYCLES = new int[0x100];
	static {
		CB_CYCLES[0x00] = 8;
		CB_CYCLES[0x01] = 8;
		CB_CYCLES[0x02] = 8;
		CB_CYCLES[0x03] = 8;
		CB_CYCLES[0x04] = 8;
		CB_CYCLES[0x05] = 8;
		CB_CYCLES[0x06] = 16;
		CB_CYCLES[0x07] = 8;
		CB_CYCLES[0x08] = 8;
		CB_CYCLES[0x09] = 8;
		CB_CYCLES[0x0A] = 8;
		CB_CYCLES[0x0B] = 8;
		CB_CYCLES[0x0C] = 8;
		CB_CYCLES[0x0D] = 8;
		CB_CYCLES[0x0E] = 16;
		CB_CYCLES[0x0F] = 8;
		CB_CYCLES[0x10] = 8;
		CB_CYCLES[0x11] = 8;
		CB_CYCLES[0x12] = 8;
		CB_CYCLES[0x13] = 8;
		CB_CYCLES[0x14] = 8;
		CB_CYCLES[0x15] = 8;
		CB_CYCLES[0x16] = 16;
		CB_CYCLES[0x17] = 8;
		CB_CYCLES[0x18] = 8;
		CB_CYCLES[0x19] = 8;
		CB_CYCLES[0x1A] = 8;
		CB_CYCLES[0x1B] = 8;
		CB_CYCLES[0x1C] = 8;
		CB_CYCLES[0x1D] = 8;
		CB_CYCLES[0x1E] = 16;
		CB_CYCLES[0x1F] = 8;
		CB_CYCLES[0x20] = 8;
		CB_CYCLES[0x21] = 8;
		CB_CYCLES[0x22] = 8;
		CB_CYCLES[0x23] = 8;
		CB_CYCLES[0x24] = 8;
		CB_CYCLES[0x25] = 8;
		CB_CYCLES[0x26] = 16;
		CB_CYCLES[0x27] = 8;
		CB_CYCLES[0x28] = 8;
		CB_CYCLES[0x29] = 8;
		CB_CYCLES[0x2A] = 8;
		CB_CYCLES[0x2B] = 8;
		CB_CYCLES[0x2C] = 8;
		CB_CYCLES[0x2D] = 8;
		CB_CYCLES[0x2E] = 16;
		CB_CYCLES[0x2F] = 8;
		CB_CYCLES[0x30] = 8;
		CB_CYCLES[0x31] = 8;
		CB_CYCLES[0x32] = 8;
		CB_CYCLES[0x33] = 8;
		CB_CYCLES[0x34] = 8;
		CB_CYCLES[0x35] = 8;
		CB_CYCLES[0x36] = 16;
		CB_CYCLES[0x37] = 8;
		CB_CYCLES[0x38] = 8;
		CB_CYCLES[0x39] = 8;
		CB_CYCLES[0x3A] = 8;
		CB_CYCLES[0x3B] = 8;
		CB_CYCLES[0x3C] = 8;
		CB_CYCLES[0x3D] = 8;
		CB_CYCLES[0x3E] = 16;
		CB_CYCLES[0x3F] = 8;
		CB_CYCLES[0x40] = 8;
		CB_CYCLES[0x41] = 8;
		CB_CYCLES[0x42] = 8;
		CB_CYCLES[0x43] = 8;
		CB_CYCLES[0x44] = 8;
		CB_CYCLES[0x45] = 8;
		CB_CYCLES[0x46] = 16;
		CB_CYCLES[0x47] = 8;
		CB_CYCLES[0x48] = 8;
		CB_CYCLES[0x49] = 8;
		CB_CYCLES[0x4A] = 8;
		CB_CYCLES[0x4B] = 8;
		CB_CYCLES[0x4C] = 8;
		CB_CYCLES[0x4D] = 8;
		CB_CYCLES[0x4E] = 16;
		CB_CYCLES[0x4F] = 8;
		CB_CYCLES[0x50] = 8;
		CB_CYCLES[0x51] = 8;
		CB_CYCLES[0x52] = 8;
		CB_CYCLES[0x53] = 8;
		CB_CYCLES[0x54] = 8;
		CB_CYCLES[0x55] = 8;
		CB_CYCLES[0x56] = 16;
		CB_CYCLES[0x57] = 8;
		CB_CYCLES[0x58] = 8;
		CB_CYCLES[0x59] = 8;
		CB_CYCLES[0x5A] = 8;
		CB_CYCLES[0x5B] = 8;
		CB_CYCLES[0x5C] = 8;
		CB_CYCLES[0x5D] = 8;
		CB_CYCLES[0x5E] = 16;
		CB_CYCLES[0x5F] = 8;
		CB_CYCLES[0x60] = 8;
		CB_CYCLES[0x61] = 8;
		CB_CYCLES[0x62] = 8;
		CB_CYCLES[0x63] = 8;
		CB_CYCLES[0x64] = 8;
		CB_CYCLES[0x65] = 8;
		CB_CYCLES[0x66] = 16;
		CB_CYCLES[0x67] = 8;
		CB_CYCLES[0x68] = 8;
		CB_CYCLES[0x69] = 8;
		CB_CYCLES[0x6A] = 8;
		CB_CYCLES[0x6B] = 8;
		CB_CYCLES[0x6C] = 8;
		CB_CYCLES[0x6D] = 8;
		CB_CYCLES[0x6E] = 16;
		CB_CYCLES[0x6F] = 8;
		CB_CYCLES[0x70] = 8;
		CB_CYCLES[0x71] = 8;
		CB_CYCLES[0x72] = 8;
		CB_CYCLES[0x73] = 8;
		CB_CYCLES[0x74] = 8;
		CB_CYCLES[0x75] = 8;
		CB_CYCLES[0x76] = 16;
		CB_CYCLES[0x77] = 8;
		CB_CYCLES[0x78] = 8;
		CB_CYCLES[0x79] = 8;
		CB_CYCLES[0x7A] = 8;
		CB_CYCLES[0x7B] = 8;
		CB_CYCLES[0x7C] = 8;
		CB_CYCLES[0x7D] = 8;
		CB_CYCLES[0x7E] = 16;
		CB_CYCLES[0x7F] = 8;
		CB_CYCLES[0x80] = 8;
		CB_CYCLES[0x81] = 8;
		CB_CYCLES[0x82] = 8;
		CB_CYCLES[0x83] = 8;
		CB_CYCLES[0x84] = 8;
		CB_CYCLES[0x85] = 8;
		CB_CYCLES[0x86] = 16;
		CB_CYCLES[0x87] = 8;
		CB_CYCLES[0x88] = 8;
		CB_CYCLES[0x89] = 8;
		CB_CYCLES[0x8A] = 8;
		CB_CYCLES[0x8B] = 8;
		CB_CYCLES[0x8C] = 8;
		CB_CYCLES[0x8D] = 8;
		CB_CYCLES[0x8E] = 16;
		CB_CYCLES[0x8F] = 8;
		CB_CYCLES[0x90] = 8;
		CB_CYCLES[0x91] = 8;
		CB_CYCLES[0x92] = 8;
		CB_CYCLES[0x93] = 8;
		CB_CYCLES[0x94] = 8;
		CB_CYCLES[0x95] = 8;
		CB_CYCLES[0x96] = 16;
		CB_CYCLES[0x97] = 8;
		CB_CYCLES[0x98] = 8;
		CB_CYCLES[0x99] = 8;
		CB_CYCLES[0x9A] = 8;
		CB_CYCLES[0x9B] = 8;
		CB_CYCLES[0x9C] = 8;
		CB_CYCLES[0x9D] = 8;
		CB_CYCLES[0x9E] = 16;
		CB_CYCLES[0x9F] = 8;
		CB_CYCLES[0xA0] = 8;
		CB_CYCLES[0xA1] = 8;
		CB_CYCLES[0xA2] = 8;
		CB_CYCLES[0xA3] = 8;
		CB_CYCLES[0xA4] = 8;
		CB_CYCLES[0xA5] = 8;
		CB_CYCLES[0xA6] = 16;
		CB_CYCLES[0xA7] = 8;
		CB_CYCLES[0xA8] = 8;
		CB_CYCLES[0xA9] = 8;
		CB_CYCLES[0xAA] = 8;
		CB_CYCLES[0xAB] = 8;
		CB_CYCLES[0xAC] = 8;
		CB_CYCLES[0xAD] = 8;
		CB_CYCLES[0xAE] = 16;
		CB_CYCLES[0xAF] = 8;
		CB_CYCLES[0xB0] = 8;
		CB_CYCLES[0xB1] = 8;
		CB_CYCLES[0xB2] = 8;
		CB_CYCLES[0xB3] = 8;
		CB_CYCLES[0xB4] = 8;
		CB_CYCLES[0xB5] = 8;
		CB_CYCLES[0xB6] = 16;
		CB_CYCLES[0xB7] = 8;
		CB_CYCLES[0xB8] = 8;
		CB_CYCLES[0xB9] = 8;
		CB_CYCLES[0xBA] = 8;
		CB_CYCLES[0xBB] = 8;
		CB_CYCLES[0xBC] = 8;
		CB_CYCLES[0xBD] = 8;
		CB_CYCLES[0xBE] = 16;
		CB_CYCLES[0xBF] = 8;
		CB_CYCLES[0xC0] = 8;
		CB_CYCLES[0xC1] = 8;
		CB_CYCLES[0xC2] = 8;
		CB_CYCLES[0xC3] = 8;
		CB_CYCLES[0xC4] = 8;
		CB_CYCLES[0xC5] = 8;
		CB_CYCLES[0xC6] = 16;
		CB_CYCLES[0xC7] = 8;
		CB_CYCLES[0xC8] = 8;
		CB_CYCLES[0xC9] = 8;
		CB_CYCLES[0xCA] = 8;
		CB_CYCLES[0xCB] = 8;
		CB_CYCLES[0xCC] = 8;
		CB_CYCLES[0xCD] = 8;
		CB_CYCLES[0xCE] = 16;
		CB_CYCLES[0xCF] = 8;
		CB_CYCLES[0xD0] = 8;
		CB_CYCLES[0xD1] = 8;
		CB_CYCLES[0xD2] = 8;
		CB_CYCLES[0xD3] = 8;
		CB_CYCLES[0xD4] = 8;
		CB_CYCLES[0xD5] = 8;
		CB_CYCLES[0xD6] = 16;
		CB_CYCLES[0xD7] = 8;
		CB_CYCLES[0xD8] = 8;
		CB_CYCLES[0xD9] = 8;
		CB_CYCLES[0xDA] = 8;
		CB_CYCLES[0xDB] = 8;
		CB_CYCLES[0xDC] = 8;
		CB_CYCLES[0xDD] = 8;
		CB_CYCLES[0xDE] = 16;
		CB_CYCLES[0xDF] = 8;
		CB_CYCLES[0xE0] = 8;
		CB_CYCLES[0xE1] = 8;
		CB_CYCLES[0xE2] = 8;
		CB_CYCLES[0xE3] = 8;
		CB_CYCLES[0xE4] = 8;
		CB_CYCLES[0xE5] = 8;
		CB_CYCLES[0xE6] = 16;
		CB_CYCLES[0xE7] = 8;
		CB_CYCLES[0xE8] = 8;
		CB_CYCLES[0xE9] = 8;
		CB_CYCLES[0xEA] = 8;
		CB_CYCLES[0xEB] = 8;
		CB_CYCLES[0xEC] = 8;
		CB_CYCLES[0xED] = 8;
		CB_CYCLES[0xEE] = 16;
		CB_CYCLES[0xEF] = 8;
		CB_CYCLES[0xF0] = 8;
		CB_CYCLES[0xF1] = 8;
		CB_CYCLES[0xF2] = 8;
		CB_CYCLES[0xF3] = 8;
		CB_CYCLES[0xF4] = 8;
		CB_CYCLES[0xF5] = 8;
		CB_CYCLES[0xF6] = 16;
		CB_CYCLES[0xF7] = 8;
		CB_CYCLES[0xF8] = 8;
		CB_CYCLES[0xF9] = 8;
		CB_CYCLES[0xFA] = 8;
		CB_CYCLES[0xFB] = 8;
		CB_CYCLES[0xFC] = 8;
		CB_CYCLES[0xFD] = 8;
		CB_CYCLES[0xFE] = 16;
		CB_CYCLES[0xFF] = 8;
	}

	private int cycles; // clock cycles run so far
	private int deltaCycles; // clock cycles run in this step

	// Update clock after execution of an op by CPU
	public void executedOp(int opcode) {
		deltaCycles += CYCLES[opcode];
	}

	public void executedCBOp(int cbOpcode) {
		deltaCycles += CB_CYCLES[cbOpcode];
	}
	
	public int getDelta() {
		return deltaCycles;
	}
	
	public void step() {
		cycles += deltaCycles;
		deltaCycles = 0;
	}
}