# video/video_recorder.py

from .video_player import VideoPlayer

class VideoRecorder(VideoPlayer):
    """Похідний клас для запису відео, успадковується від VideoPlayer."""
    
    def __init__(self, video_name):
        """
        Ініціалізація відеомагнітофона з назвою відео.
        :param video_name: Назва відеофайлу
        """
        super().__init__(video_name)
        self.is_recording = False

    def record(self):
        """Метод для початку запису відео."""
        if not self.is_playing:
            print(f"Початок запису відео: {self.video_name}")
            self.is_recording = True
        else:
            print("Неможливо почати запис під час відтворення.")

    def stop_recording(self):
        """Метод для зупинки запису відео."""
        if self.is_recording:
            print(f"Запис зупинено: {self.video_name}")
            self.is_recording = False
        else:
            print("Запис не активний.")